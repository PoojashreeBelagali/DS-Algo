package Heap;

import java.util.PriorityQueue;

public class Rope {

    public static void main(String[] args) {
        int[] a ={5,4,3,2,1};

        PriorityQueue<Integer> q = new PriorityQueue();
        for(int i=0;i<a.length;i++){
            q.add(a[i]);
        }

        int res=0;
        while (q.size()>1){
            int m = q.poll();
            int n = q.poll();
            System.out.println(m+" "+n);
            res+=m+n;
            q.add(m+n);
        }


        System.out.println(res);
    }
}
