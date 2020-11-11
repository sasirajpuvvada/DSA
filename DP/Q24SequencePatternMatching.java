package DP;

//check if s is subsequence of s2
public class Q24SequencePatternMatching {
    public static void main(String[] args) {
        String s = "axy";
        String s2 = "abcdxery";
        int n = s.length(), m = s2.length();
        System.out.println(LCS(s, s2, n, m) == n);
    }

    private static int LCS(String s, String s2, int n, int m) {

        int[][] dp = new int[n+1][m+1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}
