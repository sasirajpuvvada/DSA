package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q8UniqueSubsetsOfStringMethod2 {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ar = printSubsets(str);
        System.out.println(ar);
    }

    private static ArrayList<String> printSubsets(String str) {

        if (str.length()==0) {
            ArrayList<String> b = new ArrayList<>();
            b.add("");
            return b;
        }

        char c = str.charAt(0);
        String str1 = str.substring(1);

        ArrayList<String> ar = printSubsets(str1);
        ArrayList<String> res = new ArrayList<>();
        for (int i=0;i < ar.size();i++) {
            res.add(""+ar.get(i));
            res.add(c+ar.get(i));
        }
        return res;
    }
}
