package Recursion;

public class Q12AllPossibleBalancedParanthesis {

    public static void main(String[] args) {
        int n = 3;
        int open = n, close = n;
        solve("",open,close);
    }

    private static void solve(String op,int open,int close) {

        if (open == 0 && close==0 ) {
            System.out.println(op);
            return;
        } else {
            if (open!=0)
                solve(op+"(",open-1,close);
            if (close>open) {
                op+=")";
                close-=1;
                solve(op,open,close);
            }
        }

    }

}
