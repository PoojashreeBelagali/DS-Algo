package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {8, 9, 5, -1, 55};

         sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }

    public static int[] sort(int[] a){


        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){

                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }

        return a;
    }
}
