package Recursion;

import java.util.HashSet;
import java.util.Set;

public class Q9UniqueSubsetsOfString {

    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {

        String str = "abc";
        uniqueSubsets(str,"",0);
        System.out.println(set);
    }

    private static void uniqueSubsets(String str, String op,int index) {

        if (str.length() == index) {
            set.add(op);
            return;
        } else {

            uniqueSubsets(str,op,index+1);
            uniqueSubsets(str,op+str.charAt(index),index+1);
            return;
        }

    }

}
