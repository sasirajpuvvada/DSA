package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q22NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        List<List<String>> ans = new ArrayList<>();
        solve(n,"",0,chess,ans);
        System.out.println(ans);
    }

    private static void solve(int n, String asf, int row, int[][] chess, List<List<String>> ans) {

        if (row==chess.length) {
            //for printing in arrayList
            ans.add(display(chess,n));
            System.out.println(asf);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (safe(chess,row,col)) {
                chess[row][col] = 1;
                solve(n, asf + "(" + row + "," + col + "),", row + 1, chess, ans);
                chess[row][col] = 0;
            }
        }

    }

    private static List<String> display(int[][] chess,int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = 0;j < n;j++){
                if (chess[i][j]==1)
                    str+="Q";
                else
                    str+=".";
            }
            list.add(str);
        }
        return list;
    }

    private static boolean safe(int[][] chess, int row, int col) {

        for (int i = row - 1, j = col;i >= 0;i--) {
            if (chess[i][j]==1)
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--,j--) {
            if (chess[i][j]==1)
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--,j++) {
            if (chess[i][j]==1)
                return false;
        }

        return true;

    }
}
