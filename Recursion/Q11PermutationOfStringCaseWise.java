package Recursion;

import javafx.scene.CacheHint;

import java.util.ArrayList;

//LeetCode 784
//784. Letter Case Permutation
public class Q11PermutationOfStringCaseWise {

    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String str = "c";

        solve(str,"",0);
        System.out.println(list);
    }

    private static void solve(String str, String op, int index) {

        if (index < str.length() && !Character.isLetter(str.charAt(index)))
        {
            solve(str,op+str.charAt(index),index+1);
            return;
        }

        if (index==str.length()) {
            list.add(op);
            return;
        } else {
            solve(str,op+str.charAt(index),index+1);
            if (Character.isUpperCase(str.charAt(index)))
                solve(str,op+ (char)(str.charAt(index)+32),index+1);
            else
                solve(str,op+ (char)(str.charAt(index)-32),index+1);
        }

    }

}
