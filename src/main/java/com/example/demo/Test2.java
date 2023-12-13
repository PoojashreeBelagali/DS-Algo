package com.example.demo;

public class Test2 {

    public static void main(String[] args) {
       /* Write a function to find the longest common prefix string amongst an array of strings.
                If there is no common prefix, return an empty string "".



                Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"



        Example 1:
        Input: strs = ["flower","flow","flight", "test"]
        Output: ""



        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.*/


        String[] s = {"flower", "flow", "dog"};
        String prefix = longestPrefix(s);

        System.out.println(prefix);

    }

    private static String longestPrefix(String[] s) {
        String prefix="";
        int j=0;
        String result = "";
        for(int i = 0; i< s.length; i++){


            prefix += String.valueOf(s[i].charAt(j));

            for(int k = i+1; k< s.length; k++){

                if(s[k].startsWith(prefix)){

                } else {

                    return prefix.length()>0?prefix.substring(0, prefix.length()-1):" ";
                }
            }
            j++;
            i=0;

        }
        return prefix;
    }
}
