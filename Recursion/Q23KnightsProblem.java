package Recursion;

import java.util.Scanner;

public class Q23KnightsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        int i = 2,j = 2;
        solve(chess,n,1,i,j);
    }

    private static void solve(int[][] chess, int n, int c,int i,int j) {

        if (i < 0 || j < 0 || i >= n || j >= n || chess[i][j]!=0) {
            return;
        } else if (c == n*n) {
            chess[i][j] = c;
            display(chess);
            chess[i][j] = 0;
            return;
        }

        chess[i][j] = c;

        solve(chess,n,c+1,i-2,j+1);
        solve(chess,n,c+1,i-1,j+2);
        solve(chess,n,c+1,i+1,j+2);
        solve(chess,n,c+1,i+2,j+1);

        solve(chess,n,c+1,i+2,j-1);
        solve(chess,n,c+1,i+1,j-2);
        solve(chess,n,c+1,i-1,j-2);
        solve(chess,n,c+1,i-2,j-1);

        chess[i][j] = 0;

    }

    private static void display(int[][] chess) {
        for (int[] ar:chess) {
            for (int a:ar) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-----------------");
        System.out.println();
    }
}
