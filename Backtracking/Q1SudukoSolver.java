package Backtracking;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Q1SudukoSolver {
    public static void main(String[] args) {
        char[][] board = new char[9][9];
//        int val = 1;
//        char c = (char)(val + '0');
//        System.out.println(c);
        solve(board,0,0);
        System.out.println();
    }

    private static boolean solve(char[][] board, int row, int column) {

        int nextRow = 0;
        int nextColumn = 0;

        if (row == board.length) {
            display(board);
            return true;
        }

        if (column == board.length - 1) {
            nextColumn = 0;
            nextRow = row + 1;
        } else {
            nextColumn = column + 1;
            nextRow = row;
        }

        if (board[row][column]!='.') {
            solve(board,nextRow,nextColumn);
        } else {
            for (int val = 1; val <= 9; val++) {
                char ch = (char)(val + '0');
                if (valid(board, ch, row, column)) {
                    board[row][column] = ch;
                    solve(board, nextRow, nextColumn);
                    board[row][column] = '.';
                }
            }
        }
    return false;
    }

    private static void display(char[][] board) {
        for (char[] chars:board){
            for (char ch:chars)
                System.out.print(ch+" ");
            System.out.println();
        }
    }

    private static boolean valid(char[][] board, char val, int row, int column) {

        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == val) {
                return false;
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] == val) {
                return false;
            }
        }

        int sRow = (row/3) * 3;
        int sCol = (column/3) * 3;

        for (int i = 0; i < 3;i++) {
            for (int j = 0;j < 3;j++) {
                if (board[sRow + i][sCol + j] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}
