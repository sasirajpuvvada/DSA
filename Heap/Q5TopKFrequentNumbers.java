package Heap;

import java.util.*;


public class Q5TopKFrequentNumbers {


    static class Pair {
        int key;
        int value;
        Pair(int key,int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {

        int[] ar = {1};
        int n = ar.length;
        int k = 1;
        int[] ans = solve(ar,n,k);
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] solve(int[] ar,int n,int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
                new Comparator<Pair>() {
                    @Override
                    public int compare(Pair o1, Pair o2) {
                        return o2.key - o1.key;
                    }
                }
        );
        for (int i = 0; i < n; i++) {
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            Pair p = new Pair(entry.getValue(),entry.getKey());
            minHeap.add(p);
        }
        int i = 0;
        while (i<k)
            ans[i++] = minHeap.poll().value;
        return ans;
    }

}
