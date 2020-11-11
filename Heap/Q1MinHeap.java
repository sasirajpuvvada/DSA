package Heap;

import java.util.PriorityQueue;

public class Q1MinHeap {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(400);
        System.out.println(minHeap.poll());
        System.out.println(minHeap);

    }
}
