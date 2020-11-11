package Recursion;
//ncr
public class Q7CombinationFormula {

    public static void main(String[] args) {
        int n=4,r=2;
        System.out.print(solve(n,r));
    }

    private static int solve(int n,int r) {
        if (n==r||r==0)
            return 1;
        else {
            return solve(n-1,r-1) + solve(n-1,r);
        }
    }

}
