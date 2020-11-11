package DP;

public class Q17ShortestCommonSuperSequence {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "xycd";
        int n = a.length(), m = b.length();
        int[][] dp = new int[n+1][m+1];


        // LCS code
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(n+m - dp[n][m]);
    }
}
