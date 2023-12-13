package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class TripletCase {

    public static void main(String[] args) {

        int[] A = {1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3};
        //Sort the array first
        Arrays.sort(A);

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {

            //for 2 pointer approach set the j & k
            int j = i + 1;
            int k = A.length - 1;

            if (i > 0 && A[i] == A[i - 1]) {
                continue;
            }
            while (j < k) {

                int sum = A[i] + A[j] + A[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    int[] as = {A[i], A[j], A[k]};
                list.add(as);
                j++;
                k--;
                while(j<k && A[j]==A[j-1]) j++;
                while (j<k && A[k]==A[k+1])k++;
                }
            }

        }

        list.stream().forEach(a -> {
            System.out.println(Arrays.toString(a));
        });

    }
}
