package Recursion;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q19MazePaths {
    public static void main(String[] args) {
        ArrayList<String> ar = solve(1,1,5,5);
    }

    private static ArrayList<String> solve(int sr, int sc, int dr, int dc) {



        ArrayList<String> hpaths = solve(sr,sc+1,dr,dc);
        ArrayList<String> vpaths = solve(sr+1,sc,dr,dc);

        ArrayList<String> paths = new ArrayList<>();

        for (String str:hpaths) {
            paths.add("h" + str);
        }
        for (String str:vpaths)
            paths.add("v" + str);

        return paths;

    }
}
