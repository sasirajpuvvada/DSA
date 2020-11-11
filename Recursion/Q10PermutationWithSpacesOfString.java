package Recursion;

public class Q10PermutationWithSpacesOfString {

    public static void main(String[] args) {

        String str = "abc";
        String op = "";
        op+=str.charAt(0);
        str = str.substring(1);
        printAllPermutations(str,op,0);

    }

    private static void printAllPermutations(String str, String op,int index) {

        if (index==str.length()){
            System.out.println(op);
            return;
        } else {
            printAllPermutations(str,op+str.charAt(index),index+1);
            printAllPermutations(str,op+"_"+str.charAt(index),index+1);
        }

    }

}
