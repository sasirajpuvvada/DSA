package DP;

public class Q23LongestRepeatingSubsequence {
    public static void main(String[] args) {
        String str = "aabebcdd";
        String str2 = str;
        int n = str.length();

        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if ( (str.charAt(i-1) == str2.charAt(j-1)) && (i!=j) )
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(dp[n][n]);
    }
}
