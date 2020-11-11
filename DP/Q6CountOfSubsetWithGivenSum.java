package DP;

public class Q6CountOfSubsetWithGivenSum {
    public static void main(String[] args) {
        int[] ar = {4, 3, 2, 3, 5, 2, 1};
        int sum = 5,n=ar.length;
        int[][] dp = new int[n+1][sum+1];

        //intialisation
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0)
                    dp[i][j] = 0;
                if (j == 0)
                    dp[i][j] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (ar[i-1] <= j)
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-ar[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[n][sum]);

    }
}
