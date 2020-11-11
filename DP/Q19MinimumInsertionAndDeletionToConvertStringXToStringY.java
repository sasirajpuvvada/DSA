package DP;

public class Q19MinimumInsertionAndDeletionToConvertStringXToStringY {
    public static void main(String[] args) {
        String x = "geeksforgeeks";
        String y = "geeks";
        int n = x.length(), m = y.length();
        int[][] dp = new int[n+1][m+1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i-1) == y.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        int insertion = m - dp[n][m];
        int deletion = n - dp[n][m];
        System.out.println("insertion: "+insertion+"\ndeletion: "+deletion);

    }
}
