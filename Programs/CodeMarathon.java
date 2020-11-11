package Programs;

import java.util.PriorityQueue;

public class CodeMarathon {
    public static void main(String[] args) {
        int[] ar = {1,2,5,4};
        int k = 2;
        int n = ar.length;
        System.out.println(solve(n,k,ar));
    }

    private static int solve(int input1, int input2, int[] input3) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int sum = 0;
        for (int i:input3) {
            minHeap.add(i);
            if (minHeap.size() > input2)
                minHeap.poll();
        }
        while (!minHeap.isEmpty())
            sum+=minHeap.poll();
        return sum;
    }
}
