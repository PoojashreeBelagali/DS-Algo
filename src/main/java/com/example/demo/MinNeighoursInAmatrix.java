package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.*;

@Data
public class MinNeighoursInAmatrix {
    public static void main1(String[] args) throws URISyntaxException {



      //  int[][] a = {{12,45,33,27}, {94,54,23,53},{98,59,27,62},{11,51,63,13}};
        int[][] a = {{12,45,33}, {94,54,23},{98,59,27}};
        int[][] dp = new int[a.length][a.length];
        min(a, Integer.MAX_VALUE, dp);


    }

    public static int min(int[][] a, int minh, int[][] dp){

        int i=0,j=0,  max=Integer.MIN_VALUE;
        Map<Integer, List<String>> map = new TreeMap<>();
        while(i<a.length){

            j=0;
            while(j<a.length) {
                int min =  a[i][j];

                if (i>0) {
                    min = Math.min(min, a[i - 1][j]);
                }
                if (i+1 <a.length) {
                    min = Math.min(min, a[i + 1][j]);
                }
                if (j> 0) {
                    min = Math.min(min, a[i][j - 1]);
                }
                if (j+1 <a.length){
                    min = Math.min(min, a[i][j + 1]);
                }
                if (i-1>0 && j+1 <a.length){
                    min = Math.min(min, a[i-1][j + 1]);
                }
                if (i-1>=0 && j-1 >=0){
                    min = Math.min(min, a[i-1][j -1]);
                }
                if (i+1<a.length && j-1 >=0){
                    min = Math.min(min, a[i+1][j -1]);
                }
                if (i+1<a.length && j+1 <a.length){
                    min = Math.min(min, a[i+1][j+1]);
                }
                dp[i][j] = min;
                map.computeIfAbsent(min, k -> new ArrayList<>()).add(i+1+"#"+(j+1));
                j++;

            }
            i++;
        }

        map.entrySet().stream().reduce((one, two) -> two).get().getValue().forEach(System.out::println);

    return 0;

    }

    public static void main(String[] args) {
        String name = "a";
        String tr = "${a}";
        System.out.println(tr.contains(name));
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n][n];

        int k=0;
        while(k<n){
            String s = scan.next();
             int j=0;
            String[] ar = s.split("#");
            while(j<ar.length){
                a[k][j]= Integer.parseInt(ar[j]);
                j++;
            }
            k++;
        }




          int i=0;
        Map<Integer, List<String>> map = new TreeMap<>();
        while(i<a.length){

            int j=0;
            while(j<a.length) {
                int min =  a[i][j];

                if (i>0) {
                    min = Math.min(min, a[i - 1][j]);
                }
                if (i+1 <a.length) {
                    min = Math.min(min, a[i + 1][j]);
                }
                if (j> 0) {
                    min = Math.min(min, a[i][j - 1]);
                }
                if (j+1 <a.length){
                    min = Math.min(min, a[i][j + 1]);
                }
                if (i-1>0 && j+1 <a.length){
                    min = Math.min(min, a[i-1][j + 1]);
                }
                if (i-1>=0 && j-1 >=0){
                    min = Math.min(min, a[i-1][j -1]);
                }
                if (i+1<a.length && j-1 >=0){
                    min = Math.min(min, a[i+1][j -1]);
                }
                if (i+1<a.length && j+1 <a.length){
                    min = Math.min(min, a[i+1][j+1]);
                }
                map.computeIfAbsent(min, t -> new ArrayList<>()).add(i+1+"#"+(j+1));
                j++;

            }
            i++;
        }

        map.entrySet().stream().reduce((one, two) -> two).get().getValue().forEach(System.out::println);




    }

    class Input{
        String name;
        String expressionType;
        String expression;
        List<String> dependencies;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getExpressionType() {
            return expressionType;
        }

        public void setExpressionType(String expressionType) {
            this.expressionType = expressionType;
        }

        public String getExpression() {
            return expression;
        }

        public void setExpression(String expression) {
            this.expression = expression;
        }

        public List<String> getDependencies() {
            return dependencies;
        }

        public void setDependencies(List<String> dependencies) {
            this.dependencies = dependencies;
        }
    }
}
