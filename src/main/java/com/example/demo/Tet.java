package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tet {
    public static void main(String[] args) {
        /*

        Given an array arr[] of integers and an integer K, the task is to print all subsets of the given array with the s

        um equal to the given target K.

 arr[] = {5, 10, 12, 13, 15, 18}, K = 30
Output: {12, 18}, {5, 12, 13}, {5, 10, 15}
         */
      //  int[] a = {5, 10, 12, 13, 15, 18};
      //  int k = 30;
       // int[] res = new int[a.length];
        //generateSubSets(a, k);

        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(1);
       // int k=2;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
               //System.out.println(i+" "+j);
                System.out.print(" ");
            }
            for(int k=2;k<=n-i;k++){
                System.out.print(i+1);
            }
        //    k++;
            System.out.println();
        }

    }}

   /* public static int[] generateSubSets(int[] a, int p) {
        List<List<Integer>> subsets = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            List<Integer> aa = new ArrayList<>();
            subsets.add(List.of(a[i]));
            for (int j = i + 1; j < a.length; j++) {


                      subsets.add(List.of(a[i],a[j]));

              }


            }


        }
    }


}

    public static int[] generateSubSets(int[] a, int k, int sum, int i, int[] sub){

        if(i>=a.length){
            return sub;
        }
        if(sum==k){

            Arrays.stream(Arrays.stream(sub).toArray()).forEach(System.out::println);
        }
         //sub =  generateSubSets(a, k,sum,i+1, sub);

        for (int j = i + 1; j < a.length; j++) {


        subsets.add(List.of(a[i],a[j]));
        sub =  generateSubSets(a, k,sum,i+1, sub);

        }


        return sub;
    }
*/

