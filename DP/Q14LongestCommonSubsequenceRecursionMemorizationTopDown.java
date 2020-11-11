package DP;

public class Q14LongestCommonSubsequenceRecursionMemorizationTopDown {
    public static void main(String[] args) {
        String x = "abcdghr";
        String y = "acdhr";
        int val = LCS(x,y,x.length(),y.length());
        System.out.println(val);

        // dp solution Memorization
        int val2 = LCSMem(x,y,x.length(),y.length(), new int[x.length()+1][y.length()+1]);
        System.out.println(val2);

        // dp solution Top Down
        int val3 = LCSTopDown(x,y,x.length(),y.length(), new int[x.length()+1][y.length()+1]);
        System.out.println(val3);
    }


    private static int LCS(String x, String y, int n, int m) {
        if(n == 0 || m ==0 )
            return 0;
        if (x.charAt(n-1) == y.charAt(m-1))
            return 1 + LCS(x,y.substring(0,m-1),n-1,m-1);
        int s1 = LCS(x,y,n,m-1);
        int s2 = LCS(x,y,n-1,m);

        return Math.max(s1, s2);
    }

    private static int LCSMem(String x, String y, int n, int m, int[][] dp) {

        if (n==0 || m==0)
            return 0;
        if (dp[n][m]!=0)
            return dp[n][m];
        if (x.charAt(n-1) == y.charAt(m-1))
            return dp[n][m] = 1 + LCS(x,y.substring(0,m-1),n-1,m-1);
        else
            return dp[n][m] = Math.max(LCS(x,y,n,m-1),LCS(x,y,n-1,m));

    }

    private static int LCSTopDown(String x, String y, int n, int m, int[][] dp) {

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i-1) == y.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }

}
