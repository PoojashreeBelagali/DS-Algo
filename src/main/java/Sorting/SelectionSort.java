package Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SelectionSort {
    public static void main(String[] args) {


        int[] a = {8, 9, 5, -1, 55};

        a = sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
    public static int[] sort(int[] a){


        for(int i=0;i<a.length;i++){
            int index = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[index]){
                    index=j;
                }
            }
            int temp = a[i];
            a[i]=a[index];
            a[index]= temp;
        }
        return a;
    }
}
