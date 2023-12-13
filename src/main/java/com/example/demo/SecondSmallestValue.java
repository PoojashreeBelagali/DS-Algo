package com.example.demo;

public class SecondSmallestValue {

    public static void main(String[] args) {
        int[] a= {4,5,3,2,1,0,-1};
        int smallest = Integer.MAX_VALUE;
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
                            }

        }
        System.out.println(smallest);
    }
}
