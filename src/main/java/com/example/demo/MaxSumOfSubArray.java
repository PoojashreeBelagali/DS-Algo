package com.example.demo;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] a ={1,3,4,2,3,1,2,3};
        int[] b ={1,1,0,1,0,0,0,0};
        int k=3;
        int sum=Integer.MIN_VALUE;
        int result=0;
        for(int i=0;i<a.length;i++){
            if(b[i]==1){
                result+=a[i];
            }
        }
        int i=0;
        while(i<a.length) {
            int j=k;
            int total=0;
            while (j > 0 && i<a.length) {

                if (b[i] == 0) {
                    total += a[i];
                    j--;

                }
                i++;
            }
            sum=Math.max(total, sum);

        }

        System.out.println(sum+result);
    }
}
