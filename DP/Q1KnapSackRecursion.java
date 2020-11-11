package DP;

public class Q1KnapSackRecursion {
    public static void main(String[] args) {
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W=7;
        int n = val.length;
        int value = kanpSack(val,wt,W,n);
        System.out.println(value);
    }

    static int kanpSack(int[] val, int[] wt, int W,int n){

        if (n==0 || W==0) {
            return 0;
        }

        if (wt[n-1] <= W) {
            return Math.max(val[n-1] + kanpSack(val,wt,W-wt[n-1],n-1),kanpSack(val,wt,W,n-1));
        } else {
            return kanpSack(val,wt,W,n-1);
        }

    }

}
