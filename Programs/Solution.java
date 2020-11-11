package Programs;

import java.util.*;


class Solution {
    public static void main(String[] args) {
        long n=4;
        if ((n&(n-1)) == 0)
            System.out.println("yes");
        counterGame(n);
    }
     static  String counterGame(long n) {
        int count = 0;
        int k;
        if(n==1)
            return "Richard";
        else {
            if(n!=0 && (n&(n-1)) == 0) {
                count++;
                k = (int)(Math.log(n) / Math.log(2));
                n = n - (long) Math.pow(2,k);
            }
            k = (int)(Math.log(n) / Math.log(2));
            count+=k;
            if(count%2==0)
                return "Richard";
            else
                return "Louise";
        }

    }
}