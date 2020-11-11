package Heap;

import java.util.Arrays;

public class Q7KClosestPointsToOriginSolution2 {

    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        int[][] ans = solve(points,k);

        for (int i =0 ;i < ans.length;i++)
            System.out.println(ans[i][0]+ " "+ans[i][1]);
    }

    public static int[][] solve(int[][] points,int K) {
        int n = points.length;
        int[][] ans = new int[K][2];
        int[] ar = new int[n];
        for(int i = 0 ;i < n;i++) {
            ar[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }
        Arrays.sort(ar);
        int th = ar[K-1];
        int index = 0;
        for(int i = 0; i < n; i++) {
            int val = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if(val <= th)
                ans[index++] = points[i];
        }
        return ans;
    }

}
