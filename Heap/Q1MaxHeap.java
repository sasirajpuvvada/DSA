package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q1MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> mHeap = new PriorityQueue<>(Collections.reverseOrder());
        mHeap.add(10);
        mHeap.add(30);
        mHeap.add(20);
        mHeap.add(400);
        System.out.println(mHeap.poll());
        System.out.println(mHeap);
//        mHeap.poll();
    }
}
