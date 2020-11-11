package Recursion;

public class Q1TaylorSeriesUsingHornetsRule {
    private static int s;
    public static void main(String[] args) {
        int n=10,x=4;
        solve(x,n);
    }

    private static int solve(int x,int n) {

        if(n==0)
            return s;
        else {
            s = 1 + x/n;
            return solve(x,n-1);
        }

    }

}
