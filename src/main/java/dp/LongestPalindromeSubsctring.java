package dp;

import java.util.Arrays;

public class LongestPalindromeSubsctring {
    public static void main(String[] args) {
        String a ="ababb";



        int[][] aa = new int[a.length()][a.length()];

        int max = Integer.MIN_VALUE;
        StringBuilder bb = new StringBuilder();
        int maxLength = 1;
        for(int i=0;i<a.length();i++){
            aa[i][i]=1;
            }

        int start = 0;
        for (int i = 0; i < a.length()-1; ++i) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                aa[i][i + 1] = 1;
                start = i;
                 maxLength = 2;
            }
        }


       for(int i=-0;i<aa.length;i++){
           for(int j=0;j<aa.length;j++){
               System.out.print(aa[i][j]);
           }
           System.out.println();
       }
    }
}
