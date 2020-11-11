package DP;

public class Q7MinimumSumPartition {
    public static void main(String[] args) {
        int[] ar = {1,4};
        int n = ar.length;
        int s = 0,min = Integer.MAX_VALUE;
        for (int value : ar) {
            s += value;
        }
        boolean[][] dp = new boolean[n+1][s+1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < s + 1; j++) {
                if (ar[i-1] <= j)
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-ar[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < s + 1; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i <= s/2; i++) {
            if (dp[n][i]) {
                int val1 =  s - i;
                int val2 = i;
//                System.out.println(val1+" "+val2+" "+min);
                min = Math.min(min,Math.abs(val1 - val2));
            }
        }
        System.out.println(min);
    }
}
