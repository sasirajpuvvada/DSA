package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q7KClosestPointsToOrigin {

    static class Pair {
        double key;
        Integer[] ar;

        public Pair(double key, Integer[] ar1) {
            this.key = key;
            this.ar = ar1;
        }
    }

    public static void main(String[] args) {

        int[][] ar = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        int[][] ans = solve(ar,k);

        for (int i =0 ;i < ans.length;i++)
            System.out.println(ans[i][0]+ " "+ans[i][1]);

    }

    public static int[][] solve(int[][] ar,int k) {

        int[][] ans = new int[k][2];
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
                new Comparator<Pair>() {
                    @Override
                    public int compare(Pair o1, Pair o2) {
                        if (o1.key - o2.key < 0)
                            return 1;
                        return -1;
                    }
                }
        );

        for (int i = 0; i<ar.length;i++) {
            int x1 = ar[i][0];
            int y1 = ar[i][1];
            double key = Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
            Integer[] ar1 = new Integer[2];
            ar1[0] = ar[i][0];
            ar1[1] = ar[i][1];
            Pair pair = new Pair(key,ar1);
            maxHeap.add(pair);
            System.out.println(maxHeap.size());
            if (maxHeap.size() > k)
                maxHeap.poll();
        }

        for (int i = 0;i < k;i++) {
            Integer[] ar2 = maxHeap.poll().ar;
            ans[i][0] = ar2[0];
            ans[i][1] = ar2[1];
        }
    return ans;
    }

}
