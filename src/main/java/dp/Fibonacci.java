package dp;


import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n=1;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n, dp));
    }

    private static int fib(int n, int[] dp) {

        if(n<=1){
            return n;


        }
    if(dp[n]==-1){
        dp[n]=fib(n-1, dp)+fib(n-2, dp);

        return dp[n];
    }
    return dp[n];
    }

}
