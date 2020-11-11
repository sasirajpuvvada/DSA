package Programs;

import java.util.HashSet;

//36. Valid Sudoku
public class ValidSuduko {
    public static void main(String[] args) {
        char[][] board = new char[9][9];
        HashSet<String> set = new HashSet<>();
        for (int i = 0;i < board.length;i++) {
            for (int j= 0; j < board.length ; j++) {
                String s = "("+board[i][j]+")";
                if (!set.add(s+i) || set.add(s+j) || set.add(s+i/3 + j/3)) {
                    System.out.println(false);
                    return;
                }
            }
        }
    }
}
