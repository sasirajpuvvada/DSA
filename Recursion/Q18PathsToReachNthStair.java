package Recursion;

import java.util.ArrayList;

//using steps 1,2,3
public class Q18PathsToReachNthStair {

    public static void main(String[] args) {
        int n=5;
        ArrayList<String> ar = solve(n);
        System.out.println(ar);
    }

    static ArrayList<String> solve(int n) {

        if (n==0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            return new ArrayList<>();
        }

        ArrayList<String> paths1 = solve(n-1);
        ArrayList<String> paths2 = solve(n-2);
        ArrayList<String> paths3 = solve(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for (String str:paths1)
            paths.add("1"+str);
        for (String str:paths2)
            paths.add("2"+str);
        for (String str:paths3)
            paths.add("3"+str);
        return paths;

    }

}
