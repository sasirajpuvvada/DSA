package Backtracking;

public class Q2PathFOrMaxGold {
    public static void main(String[] args) {
        int[][] ar = {{0,6,0},{5,8,7},{0,9,0}};
        int max = 0;
        boolean[][] visited = new boolean[ar.length][ar[0].length];
        for (int i = 0; i < ar.length;i++) {
            for (int j = 0; j < ar[0].length;j++) {
                if (ar[i][j]!=0) {
                    int val = solve(ar, i, j, ar.length, ar[0].length,0,0);
                    max = Math.max(max,val);
                }
            }
        }
    }

    private static int solve(int[][] ar, int i, int j, int m, int n,int curMax,int value) {

        if (i < m || j < n || i == m || j == n) {

        }

    return 0;
    }
}
