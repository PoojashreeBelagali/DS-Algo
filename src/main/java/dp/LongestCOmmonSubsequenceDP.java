package dp;

import java.util.HashSet;
import java.util.Set;

public class LongestCOmmonSubsequenceDP {

    public static void main(String[] args) {
        String a= "abcde";
        String b ="abc";
        StringBuilder result= new StringBuilder();
        int[][] dp =  new int[a.length()+1][b.length()+1];
        for(int i=a.length()-1;i>=0;i--){
            for(int j=b.length()-1;j>=0;j--){
                if(a.charAt(i)==b.charAt(j)){
                    dp[i][j]= dp[i+1][j+1]+1;
                    result.append(a.charAt(i));
                } else {
                    dp[i][j]= Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }

        }
        System.out.println(result.reverse());
        System.out.println(dp[0][0]);

        Set set = new HashSet();
        set.contains(1);
    }
}
