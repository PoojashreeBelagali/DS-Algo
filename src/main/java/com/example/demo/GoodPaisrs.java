package com.example.demo;

public class GoodPaisrs {
    public static void main(String[] args) {
        int ans=0;
        int[] a={1,1,1,1};
        int[] count = new int[101];
        for(int i: a){
            count[i]++;
        }
        for (int j:count){
            ans+=(j*(j-1))/2;
        }
        System.out.println(ans);
    }
}
