package DP;

public class Q9UnboundedKnapSack {
    public static void main(String[] args) {
        int[] val = {10, 40, 50, 70};
        int[] wt = {1, 3, 4, 5};
        int W = 8;
        int n = val.length;
        int[][] dp =new int[n+1][W+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {

                if (wt[i-1] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j],val[i-1] + dp[i][j-wt[i-1]]);
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
        System.out.println(dp[n][W]);

    }
}
