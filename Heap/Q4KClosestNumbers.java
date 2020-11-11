package Heap;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;


//Mark:-TODO
public class Q4KClosestNumbers {

    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5};
        int n = ar.length;
        int x = 3;
        int k = 4;
        int[] ar1 = solve(ar,k,x);
        for (int i:ar1)
            System.out.print(i+" ");
    }

    static class Pair {
        int key;
        int value;
        Pair(int key,int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static int[] solve(int[] ar,int k,int x) {
        int[] ar1 = new int[k];
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
                new Comparator<Pair>() {
                    @Override
                    public int compare(Pair o1, Pair o2) {
                        return o2.key - o1.key;
                    }
                }
        );
        int val;
        for (int i=0 ;i< k;i++) {
            val = Math.abs(x-i);
            Pair p = new  Pair(val,i);
            maxHeap.add(p);
        }
        for (int i=k ;i< ar.length;i++) {
            val = Math.abs(x-i);
            Pair p = new  Pair(val,i);

            if (maxHeap.peek().key > val) {
                maxHeap.poll();
                maxHeap.add(p);
            }
        }

        for(int i=0;i<k;i++)
            ar1[i] = maxHeap.poll().value;
        Arrays.sort(ar1);
        return ar1;
    }

}
