package com.example.demo;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k=3;
        int cur_sum=0;
        int max_sum= Integer.MIN_VALUE;
        int i=0;
        while(i<k){
            cur_sum+=arr[i];
            i++;
        }
        for(i=k;i<arr.length;i++){
            cur_sum=cur_sum+arr[i]-arr[i-k];
            max_sum=Math.max(cur_sum, max_sum);
        }
        System.out.println(max_sum);
    }
}
