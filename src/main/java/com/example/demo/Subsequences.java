package com.example.demo;

public class Subsequences {
    public static void main(String[] args) {
      int[]  A = {1, 2, 2, 3, 1,3,4};
        int num=A[0];
        for(int i=1;i<A.length;i++){
            num^=A[i];
        }
        System.out.println(num);
    }
}
