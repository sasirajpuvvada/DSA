package DP;

public class Q5SubsetSumTopDown {
    public static void main(String[] args) {
        int[] ar = {2,3,7,8,10};
        int sum = 11,n=ar.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        //intialisation
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0)
                    dp[i][j] = false;
                if (j == 0)
                    dp[i][j] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (ar[i-1] <= j)
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-ar[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[n][sum]);
    }
}
