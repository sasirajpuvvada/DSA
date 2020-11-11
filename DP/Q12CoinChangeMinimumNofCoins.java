package DP;

import java.util.Arrays;

public class Q12CoinChangeMinimumNofCoins {
    public static void main(String[] args) {
        int[] ar = {9, 2, 11, 5, 14, 17, 8, 18};
//        Arrays.sort(ar);
        int n = ar.length;
        int sum = 39;

        int[][] dp = new int[n+1][sum+1];

        Arrays.fill(dp[0], Integer.MAX_VALUE - 1);


        dp[0][0] = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {

                if (ar[i-1] <= j)
                    dp[i][j] = Math.min(dp[i-1][j],1 + dp[i][j-ar[i-1]]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

    }
}
