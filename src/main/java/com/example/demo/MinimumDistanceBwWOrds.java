package com.example.demo;

public class MinimumDistanceBwWOrds {
    public static void main(String[] args) {
        String a = "geeks for geeks contribute practice geeks practice";
        String word1="for";
        String word2="contribute";
        System.out.println(getMinDistance(a, word1, word2));
    }

    private static int getMinDistance(String a, String word1, String word2) {
        if(word1.equals(word2)){
            return 0;
        }
        String[] s = a.split(" ");
        int wordIndex = -1;
        int distance = Integer.MAX_VALUE;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals(word1) || s[i].equals(word2)){
                if(wordIndex==-1){
                    wordIndex=i;
                }
                else {
                    if(s[i].equals(s[wordIndex])){
                        wordIndex=i;
                    } else{
                        distance=Math.min(distance, (i-wordIndex));
                    }
                }
            }
        }
        return distance;
    }
}
