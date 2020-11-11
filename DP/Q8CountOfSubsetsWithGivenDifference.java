package DP;

//Take any two subsets their difference should be equal to given difference
public class Q8CountOfSubsetsWithGivenDifference {
    public static void main(String[] args) {
        int[] ar = {1,1,2,3};
        int n = ar.length;
        int diff = 1, sum = 0, c = 0;

        for (int val:ar)
            sum+=val;

        int s1 = ( diff + sum ) / 2;

        int[][] dp = new int[n+1][s1 + 1];

        for (int i = 0; i < n + 1; i++)
            dp[i][0] = 1;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < s1 + 1; j++) {
                if (ar[i-1] <= j)
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-ar[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        System.out.println(dp[n][s1]);

    }
}
