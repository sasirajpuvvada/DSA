package Recursion;

import java.util.ArrayList;

public class Q17KeypadCombinations {
    static String[] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        ArrayList<String> ans = solve("23");
        System.out.println(ans);
    }

    private static ArrayList<String> solve(String s) {
        if (s.length()==0) {
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }
        char c = s.charAt(0);
        String rem = s.substring(1);
        ArrayList<String> ar = solve(rem);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < codes[c - '0'].length(); i++) {
            char ch = codes[c-'0'].charAt(i);
            for (int j = 0; j < ar.size();j++) {
                ans.add(ch+ar.get(j));
            }
        }
    return ans;
    }
}
