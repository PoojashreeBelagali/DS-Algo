package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PainterPartition {
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int[] a ={5,10,30,20,15};
        Arrays.sort(a);


        int sum = 0;

       sum= IntStream.of(a).sum();
       int x=0;
       int max = Integer.MIN_VALUE;
       while(x<=n){

           int high = a[a.length-1]*k;
           int low=sum;
           int mid = (high+sum)/2;

            int total = 0;
           for(int i=0;i<a.length;i++){
               total += a[i]*k;
               if(total>mid){
                   x++;
                   max=Math.max(max, total);
                   total=0;
               }
           }
           if(x<=n){

           }
       }
    }
}
