package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class ListToArray {
    public static void main(String[] args) {
        Set<int[]> list = new HashSet<>();
int[] a = {5,8,9};
        list.add(a);
        int [] b = {1,2,3};
        list.add(b);
        int[][] aa = list.stream().toArray(int[][] ::new);
        for (int i =0;i< aa.length;i++){
      //      System.out.println(Arrays.toString(aa[i]));
        }

        int[] nums = {1,2};
        int k =2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }


        List<Integer> s = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                                       Map.Entry::getValue,
                                         (oldValue, newValue)->oldValue,
                                           LinkedHashMap::new)).entrySet().stream().map(e->e.getKey()).collect(Collectors.toList()).subList(0,k);

       int[] a1 = s.stream().mapToInt(e->e).toArray();


      // map.entrySet().stream().sorted(Comparator.comparing().reversed()).collect(Collectors.toList())


        System.out.println(s);

    }

}
