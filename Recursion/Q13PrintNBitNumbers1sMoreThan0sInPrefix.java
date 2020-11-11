package Recursion;

import com.sun.xml.internal.ws.util.StringUtils;

public class Q13PrintNBitNumbers1sMoreThan0sInPrefix {

    public static void main(String[] args) {

        int n=2;
        solve("1",n);

    }

    private static void solve(String str,int n) {

        if (str.length()==n) {
            System.out.println(str);
            return;
        } else {
            int cOnes = count(str);
            int cZeroes = str.length()-cOnes;

            solve(str+"1",n);
            if (cZeroes < cOnes)
                solve(str+"0",n);
        }

    }

    private static int count(String string) {
        int c=0;
        for (char ch:string.toCharArray()) {
            if (ch=='1')
                c++;
        }
        return c;
    }

}
