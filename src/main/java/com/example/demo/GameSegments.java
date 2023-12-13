package com.example.demo;

public class GameSegments {


    public static void main(String[] args) {
       int[] input  = {1,1,0,1  };
       // int[] input = {1,1,1,0,1,1};
        int[] sumArr = new int[input.length];
        int sum = 0;

        for(int i = 0; i < input.length; i++) {
            sum += input[i];
            sumArr[i] = sum;
        }

        int half = sum / 2;
        int k = 0;
        while(sumArr[k] < half) {
            k++;
        }
        System.out.println(k);
    }

}
