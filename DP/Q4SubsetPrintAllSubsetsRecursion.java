package DP;

import java.util.*;

public class Q4SubsetPrintAllSubsetsRecursion {
    public static void main(String[] args) {
        int[] ar = {1,2,3,6,3,7};
        int sum = 7;
        ArrayList<Integer> list = new ArrayList<>();
        solve(ar,ar.length,sum,list);
    }

    private static void solve(int[] ar, int n, int sum, ArrayList<Integer> list) {

        if (sum == 0) {
            display(list);
            return;
        }
        if (n==0)
            return;

        solve(ar,n-1,sum,list);
        ArrayList<Integer> list2 = new ArrayList<>(list);
        list2.add(ar[n-1]);
        solve(ar,n-1,sum-ar[n-1],list2);
    }

    private static void display(ArrayList<Integer> list) {
        for (Integer a:list)
            System.out.print(a+" ");
        System.out.println();
    }

}
