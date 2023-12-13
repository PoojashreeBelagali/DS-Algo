package com.example.demo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MinimumRailwaystation {

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        List<Integer> list = new CopyOnWriteArrayList<>();
        int count =1;
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<arrival.length;i++){

            if(arrival[i]<departure[i-1] ){
                count++;
                list.add(departure[i-1]);
            }
           for(Integer l:list)
           {
               if(l<arrival[i]){
                   count--;
                   list.remove(l);
               }
           }
           ans = Math.max(ans, count);

        }
        System.out.println(ans);
    }
}
