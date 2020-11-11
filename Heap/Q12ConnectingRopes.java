package Heap;

import java.util.*;

public class Q12ConnectingRopes {
    public static void main (String[] args)
    {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-- > 0) {
            int n;
            n = sc.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i<n; i++)
                ar[i] = sc.nextInt();

            Long ans = connectRopesPrice(ar);
            System.out.println(ans);

        }
    }

    private static long connectRopesPrice(int[] ar) {
        long cost = 0;
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (long val:ar)
            minHeap.add(val);
        while (minHeap.size() > 1) {
            long min1 = minHeap.poll();
            long min2 = minHeap.poll();
            cost += min1 + min2;
            minHeap.add(min1+min2);
        }
        return cost;
    }
}
