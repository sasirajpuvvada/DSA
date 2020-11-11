package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Q14NumberOfPathsInMatrix {
    static ArrayList<String> l = new ArrayList<>();
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        System.out.println(solve(n,m,1,1));
        //dp solution
        int[][] dp = new int[n+1][m+1];
        for (int[] ar:dp)
            Arrays.fill(ar,-1);
        System.out.println("dp solution"+solve2(n,m,1,1,dp));
        //paths
        pathsprint(n,m,1,1,"");
        System.out.println(l);

    }


    private static void pathsprint(int n, int m, int sr, int sc, String s) {

        if (sr == n && sc == m) {
            l.add(s);
            return;
        }
        if (sr > n || sc > m)
            return;

        pathsprint(n,m,sr+1,sc,s+"h");
        pathsprint(n,m,sr,sc+1,s+"v");

    }

    private static int solve2(int n, int m, int sr, int sc, int[][] dp) {

        if (sr == n && sc == m) {
            return 1;
        }
        if (sr > n || sc > m)
            return 0;

        if (dp[sr][sc]!=-1)
            return dp[sr][sc];

        return dp[sr][sc] = solve(n,m,sr+1,sc) + solve(n,m,sr,sc+1);

    }

    private static int solve(int n,int m,int sr,int sc) {

        if (sr == n && sc == m) {
            return 1;
        }
        if (sr > n || sc > m)
            return 0;
        return solve(n,m,sr+1,sc) + solve(n,m,sr,sc+1);

    }

}
