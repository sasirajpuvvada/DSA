package DP;

public class Q18PrintShortestCommonSuperSequence {
    public static void main(String[] args) {
        String a = "geek";
        String b = "hello";

        int n = a.length(), m = b.length();
        int[][] dp = new int[n+1][m+1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }

        StringBuilder str = new StringBuilder();
        while ( n > 0 && m > 0) {
            if (a.charAt(n-1)==b.charAt(m-1)) {
                str.append(a.charAt(n - 1));
                n--; m--;
            } else if (dp[n][m-1] > dp[n-1][n]) {
                str.append(b.charAt(m - 1));
                m--;
            } else {
                str.append(a.charAt(n - 1));
                n--;
            }
        }
        while (n > 0) {
            str.append(a.charAt(n - 1));
            n--;
        }
        while (m > 0) {
            str.append(b.charAt(m - 1));
            m--;
        }

        System.out.println(str.reverse().toString());

    }
}
