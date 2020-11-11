package Imp;

import java.util.Scanner;

public class CountOf1toNDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,count=0;
        n = sc.nextInt();
        for (int i=1; i<=n; i*=10) {
            count = count + (n - i + 1);
        }
        System.out.println(count);
    }
}
