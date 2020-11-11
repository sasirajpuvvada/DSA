package Programs;

import java.util.*;


public class Ans3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t,n,k,l;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            l = sc.nextInt();
            if (n == 1 && k==1) {
                System.out.println("1");
                continue;
            } else if (k == 1 || n > (k * l)) {
                System.out.println("-1");
                continue;
            }

            int i = 0;
            while ( i < n) {
                System.out.print(i%k + 1);
                i++;
            }
            System.out.println();
        }

    }

}

