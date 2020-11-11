package DP;

public class Q11CoinChangeCountNumberOfWays {
    public static void main(String[] args) {
        int[] S = {1,2,3};
        int n = 4;
        int m = S.length;

        long[][] dp = new long[m+1][n+1];
        for(int i = 0; i < m + 1; i++) {
            for(int j = 0; j < n + 1; j++) {
                if(i==0)
                    dp[i][j] = 0;
                if(j==0)
                    dp[i][j] = 1;
            }
        }

        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(S[i-1] <= j)
                    dp[i][j] = dp[i-1][j] + dp[i][j-S[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        System.out.println(dp[m][n]);
    }
}
