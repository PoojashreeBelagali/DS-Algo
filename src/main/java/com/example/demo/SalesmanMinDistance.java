package com.example.demo;

public class SalesmanMinDistance {
    public static void main(String[] args) {
        int[][] a = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};

        int sum = 0;
        sum = minCost(a, a.length, a[0].length);
        System.out.println(sum);
        sum= minCostrec(a, 0,0);
      System.out.println(sum);
    }

    public static int minCost(int[][] cost, int m, int n) {

        int[][] dp = new int[m][n];
        dp[0][0] = cost[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Check if we're not at the starting point
                if (i > 0 || j > 0) {
                    // Calculate the cost to reach the current cell
                    int fromLeft = (j > 0) ?dp[i][j -  1] : Integer.MAX_VALUE;
                    int fromAbove = (i > 0) ? dp[i - 1][j] : Integer.MAX_VALUE;
                    dp[i][j] = Math.min(fromLeft, fromAbove) + cost[i][j];
                }
            }
        }
        return dp[2][2];

    }

    public static int minCostrec(int[][] cost,int i, int j) {


      if(i>=cost.length|| j>=cost[0].length){
          return Integer.MAX_VALUE;
      }
        if(i==cost.length-1&&j==cost[0].length-1)
            return cost[i][j];
       int lftSUm = minCostrec(cost,i, j+1);
    //    System.out.println(i+" "+j);
      //  System.out.println("------------------------");
       int reft = minCostrec(cost,  i+1, j);
       // System.out.println(i+" "+j);
        int dia = minCostrec(cost,  i+1, j+1);
        int min = Math.min(lftSUm, reft);

         //min=Math.min(dia,min);
      //  System.out.println(lftSUm+" "+reft+ " "+min);
      return  cost[i][j]+min;
    }


}
