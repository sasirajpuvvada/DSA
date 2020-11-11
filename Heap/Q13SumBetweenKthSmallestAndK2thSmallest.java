package Heap;

import java.util.*;

public class Q13SumBetweenKthSmallestAndK2thSmallest {

    public static void main(String[] args) {

        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n = sc.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            long k1 = sc.nextLong();
            long k2 = sc.nextLong();
            int sum = 0;
            long first = getNumber(ar,k1);
            long second = getNumber(ar,k2);
            System.out.println(first+" "+second);
            for (int i = 0; i < n ; i++) {
                if (ar[i]>first && ar[i] <second)
                    sum+=ar[i];
            }
            System.out.println(sum);
        }
    }

    private static long getNumber(int[] ar, long k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (long val:ar) {
            maxHeap.add(val);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return maxHeap.poll();
    }

}
