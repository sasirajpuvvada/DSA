package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q2KLargestElements {
    public static void main(String[] args) {
        int n=7,k=3;
        int[] ar = {1,23,12,9,30,2,50};
        System.out.println(solve(ar,n,k));
    }
    public static ArrayList<Integer> solve(int[] ar,int n,int k) {

        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i:ar) {
            heap.add(i);
            if (heap.size()>k)
                heap.poll();
        }
        while (!heap.isEmpty())
            list.add(heap.poll());
        Collections.reverse(list);
        return list;
    }
}
