package Recursion;

import java.util.Scanner;
// pepcoding floodfill (recusrion playlist)
public class Q21FloodFill {
    public static void main(String[] args) {
        int i,j,n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] maze = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        solve(0,0,n,m,maze,visited,"");

    }

    private static void solve(int i, int j, int n, int m, int[][] maze, boolean[][] visited, String s) {

        if (i<0 || j<0 || i==n || j==m || maze[i][j]==1 || visited[i][j]) {
            return;
        }

        if (i==n-1 && j==m-1) {
            System.out.println(s);
            return;
        }

        visited[i][j] = true;
        solve(i-1,j,n,m,maze,visited,s+"t");
        solve(i,j-1,n,m,maze,visited,s+"l");
        solve(i+1,j,n,m,maze,visited,s+"d");
        solve(i,j+1,n,m,maze,visited,s+"r");
        visited[i][j] = false;
    }
}
