package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayMan {
    public static void main(String[] args) {

        int n = 4;
        List<List<Integer>> queries = new ArrayList<>();
                List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(603);

        queries.add(l);
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(1);
        l1.add(286);
        queries.add(l1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(4);
        l2.add(882);
        queries.add(l2);




        long[] a = new long[n+2];
        long max=Integer.MIN_VALUE;
        int i=0;
        while(i<queries.size()){

            List<Integer> list = queries.get(i);
            int p=list.get(0);
            int q = list.get(1);
            long value=list.get(2);


            a[p-1]+= value;
            a[q]-=value;
            i++;
        }

        long sum=0;
        for( i=0;i<a.length;i++){
            sum+=a[i];
            max=Math.max(max, sum);
        }


        System.out.println(max);
        //return max;

        Map<String, Integer> map = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        map.put("p", 2);
        stringList.add("p");
        stringList.add("s");
        for(String s:stringList){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        String a1 ="11";
        int[] d =  new int[1];
        d[0]= Integer.parseInt(a1);




    }
}
