package DP;

public class Q15LongestCommonSubString {
    public static void main(String[] args) {
        String x = "geeksforgeeks";
        String y = "geeksquiz";
        int n = x.length(), m = y.length(),max = 0;
        int[][] dp = new int[n+1][m+1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(dp[i][j],max);
                }
                else
                    dp[i][j] = 0;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
