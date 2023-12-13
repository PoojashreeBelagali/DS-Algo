package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
       /* Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2,
        return the shortest distance between these two words in the list.



                Example 1:
        Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "coding", word2 = "practice"
        Output: 3



        Example 2:
        Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "coding"
        Output: 1



        Constraints:
        2 <= wordsDict.length <= 3 * 10~4
        1 <= wordsDict[i].length <= 10
        wordsDict[i] consists of lowercase English letters.
                word1 and word2 are in wordsDict.
                word1 != word2*/

       String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";

        int shortestDistance = findShortestDistance( wordsDict, word1, word2);
    }

    private static int findShortestDistance(String[] wordsDict, String word1, String word2) {


        int distance =0;
        List<Integer> list = new ArrayList<>();
        int count =0 ;
        for(int i=0;i<wordsDict.length;i++) {
            if(wordsDict[i]==word1){
                count++;
                list.add(i);
                int left=i;
                int right = i;
                int leftCount=0;
                int rightCount=0;
                while(left>=0 && right<wordsDict.length){

                    if(wordsDict[left]==word2){
                        leftCount++;
                    }
                }

            }
        }

        return count;
    }
}
