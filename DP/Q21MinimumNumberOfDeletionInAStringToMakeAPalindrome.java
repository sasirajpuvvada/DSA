package DP;

public class Q21MinimumNumberOfDeletionInAStringToMakeAPalindrome {
    public static void main(String[] args) {
        String str = "agbcba";
        StringBuilder s = new StringBuilder();
        s.append(str);
        String strRev = s.reverse().toString();
        //        System.out.println(str+" "+strRev);
        int n = str.length();
        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str.charAt(i-1) == strRev.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(n - dp[n][n]);
    }
}
