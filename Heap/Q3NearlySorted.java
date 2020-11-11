package Heap;

import java.util.PriorityQueue;

public class Q3NearlySorted {
    public static void main(String[] args) {
        int[] ar = {6,5,3,2,8,10,9};
        int k=3;
        solve(ar,k);
        for (int i:ar)
            System.out.print(i+" ");
    }
    private static void solve(int[] ar,int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        int[] arr = new int[ar.length];
        int index=0;
        for (int i:ar) {
            minHeap.add(i);
            if (minHeap.size()>k)
            {
                ar[index++] = minHeap.poll();
            }
        }
        while (!minHeap.isEmpty())
            ar[index++]=minHeap.poll();

    }
}
