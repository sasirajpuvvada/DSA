package DP_MCM;

public class Q0MCM {
    public static void main(String[] args) {
        int[] ar = {10,30,5,60};
        int n = ar.length,l = 1,r = n - 1;
        int ans = MCMrecusrion(ar,l,r);
        System.out.print(ans);
    }

    public static int MCMrecusrion(int[] ar, int l, int r) {
        if (l == r)
            return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = l; i < r; i++) {
            int tempRes = MCMrecusrion(ar,l,i) + MCMrecusrion(ar, i+1, r) + (ar[l-1] * ar[i] * ar[r]);
//            System.out.println(tempRes);
            ans = Math.min(ans,tempRes);
        }
        return ans;
    }
}
