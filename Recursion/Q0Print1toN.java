package Recursion;

public class Q0Print1toN {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    private static void print(int n) {

        if(n==0) {
//            System.out.print(n+" ");
            return;
        }
//        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
}
