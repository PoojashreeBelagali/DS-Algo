package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {8, 9, 5, -1, 55};

        sort(a, a.length);
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void sort(int[] a, int n){
        if(n<2){
            return;
        }

        int middle = n/2;
        int[] leftArray=new int[middle];
        int[] rightArray = new int[n-middle];

        for (int i=0;i<middle;i++){
            leftArray[i] = a[i];
        }

        for (int i=middle;i<n;i++){
            rightArray[i-middle] = a[i];
        }

        sort(leftArray, middle);
        sort(rightArray, n-middle);

      merge(a, leftArray, rightArray, middle, n-middle);
      String s="";
     // s.substring();
    }


    private static void merge(int[] a, int[] leftArray, int[] rightArray, int left, int right) {

        int j=0;
        int i=0;
        int k=0;

       while(i<left && j<left){
           if(leftArray[i]<=rightArray[j]){
               a[k++]=leftArray[i++];
           } else {
               a[k++]=rightArray[j++];
           }

       }
       while(i<left){
           a[k++]=leftArray[i++];
       }

       while ((j<right)){
           a[k++]=rightArray[j++];
       }


    }
}
