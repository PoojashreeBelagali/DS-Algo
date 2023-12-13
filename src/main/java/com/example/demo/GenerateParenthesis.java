package com.example.demo;

import java.util.ArrayList;

public class GenerateParenthesis {
    private ArrayList<String> list = new ArrayList();

    public ArrayList<String> generateParenthesis(int A) {

        solve("", 2 * A, 0, 0);


        return list;


    }


    private void solve(String s, int length, int open, int close) {

        // S= result

        // length= total length of result string i.e. 2N , if N=2 length would be 4

        // open = count of opening brackets,

        // close = count of closing brackets

        if (s.length() == length) {

            //list = new ArrayList();

            list.add(s);


            return;

        }


        if (open < length / 2) {


            //open++;

            solve(s + "(", length, open + 1, close);


        }

        if (close < open) {


            //close++;

            solve(s + ")", length, open, close + 1);


        }

    }

    public static void main(String[] args) {
        GenerateParenthesis k = new GenerateParenthesis();

        System.out.println(k.generateParenthesis(3));
    }

}
