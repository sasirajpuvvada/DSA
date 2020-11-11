package DP;

import java.util.ArrayList;

public class Q3SubsetSumRecursion {
    public static void main(String[] args) {

        int[] ar = {1,2,5,3,4};
        int sum = 10;
        System.out.println(solve(ar,ar.length,sum));
    }

    private static boolean solve(int[] ar, int n, int sum) {

        if (sum==0) {
            return true;
        }

        if (n == 0)
            return false;

        if (ar[n-1] > sum) {
            solve(ar, n - 1, sum);
        }
        return solve(ar, n - 1, sum - ar[n - 1]) || solve(ar,n-1,sum);

    }

}
