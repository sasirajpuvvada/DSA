package Imp;

import java.util.Scanner;

//443. String Compression
public class Q3StringCompression {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        char[] chars = new char[str.length()];
        chars = str.toCharArray();
        int l = chars.length;
        int c = 1;
        String string = "";
        for (int i = 0; i < l-1;i++) {

            if (chars[i] == chars[i+1]) {
                c++;
            } else {
                string+=chars[i];
                if (c!=1)
                string+= String.valueOf(c);
                c = 1;
            }
        }
        string+=chars[l-1];
        if (c!=1)
        string+=String.valueOf(c);
        System.out.println(string);

    }
}
