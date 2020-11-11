package DP;

public class Q16PrintLongestCommonSubsequence {
    public static void main(String[] args) {
        String x = "abcdghr";
        String y = "acdh";
        int n = x.length(), m = y.length();
        int[][] dp = new int[n+1][m+1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder str = new StringBuilder();
        while (dp[n][m]!=0) {
            if (x.charAt(n-1) == y.charAt(m-1)) {
                str.append(x.charAt(n - 1));
                n--;
                m--;
            } else if (dp[n-1][m] > dp[n][m-1]) {
                n--;
            } else {
                m--;
            }
        }
        System.out.println(str);
    }
}
