package Recursion;

import java.util.*;

public class Q8SubsetOfString {

    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {

        String str = "abc";
        printSubsets(str,"");
        list.remove("");
        Collections.sort(list);
        System.out.println(list);
    }

    private static void printSubsets(String str, String op) {

        if (str == "") {
            list.add(op);
            return;
        } else {
            String op1 = op;
            String op2 = op;
            op2 = op2 + str.charAt(0);
            if(str.length()>1)
                str = str.substring(1);
            else
                str = "";
            printSubsets(str,op1);
            printSubsets(str,op2);
        }

    }

}
