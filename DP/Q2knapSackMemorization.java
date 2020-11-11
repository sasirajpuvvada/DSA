package DP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2knapSackMemorization {
    public static void main(String[] args) {
            int[] wt = {1,1,1};
            int[] val = {10,20,30};
            int W=2;
            int n = val.length;
            int[][] dp = new int[n+1][W+1];
            for (int[] ar: dp)
                Arrays.fill(ar,-1);
            int value = kanpSackMem(val,wt,W,n,dp);
            System.out.println(value);
    }


    private static int kanpSackMem(int[] val, int[] wt, int w, int n, int[][] dp) {

        if (n==0 || w==0) {
            return 0;
        }

        if (dp[n][w]!=-1)
            return -1;

        if (wt[n-1] <= w) {
            return dp[n][w] = Math.max(val[n-1]+kanpSackMem(val,wt,w-wt[n-1],n-1,dp),kanpSackMem(val,wt,w,n-1,dp));
        } else {
            return dp[n][w] = kanpSackMem(val,wt,w,n-1,dp);
        }

    }
}
