package DP;

import java.util.ArrayList;

public class Q2KnapSackTopDown {
    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W=7;
        int n = val.length;
        int value = kanpSack(val,wt,W,n);
        System.out.println(value);
    }

    public static int kanpSack(int[] val, int[] wt, int W, int n) {

        int[][] dp = new int[n+1][W+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {

                if (wt[i-1] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j],val[i-1] + dp[i-1][j-wt[i-1]]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return dp[n][W];
    }

}
