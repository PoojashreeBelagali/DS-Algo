package Sorting;


import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {8, 9, 5, -1, 55};

        sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }

    private static int[] sort(int[] a) {


        for(int i=1;i<a.length;i++){
            int current = a[i];
            int j=i-1;
            while(j>=0 && a[j]>current){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }

        // Initializing a list of type Linkedlist
        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(15);
        l.add(20);
        System.out.println(l);

        // Initializing a collection to be appended to list
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        System.out.println(arr);

        l.addAll(arr);

        System.out.println(l);
        arr.remove(0);
        System.out.println(l);
        System.out.println(arr);
     //   Pair temp = new KeyPair(


        return a;
    }

}
