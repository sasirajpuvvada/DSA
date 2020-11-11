package JulyChallenge;

import java.util.ArrayList;
import java.util.List;

//Day 12
public class reverseBits {

    public static int reverseBits(int n) {
        System.out.println(Integer.toBinaryString(n));
        String str = "11111111111111111111111111111101";
        System.out.println(str.length());
        StringBuilder in = new StringBuilder();
        in.append(str);
        str = in.reverse().toString();
        int l = str.length();
        l=32-l;
        String a = "";
        while (l-->0) {
            a=a+"0";
        }
        if(!a.equals(""))
            str = str + a;
        System.out.println(str);
        int decimal=Integer.parseInt(str,2);
        return decimal;
    }

    public static void main(String[] args) {
        int n = 10;
//        String s = "11111111111111111111111111111101";
//        System.out.print(s.length());
//        System.out.print(Integer.parseInt(s,2));
//        System.out.println(reverseBits(n));
        System.out.println(reverseBits1(n));
    }

    private static Integer reverseBits1(int n) {

        int times=32,t,res=0;
        List<Integer> a= new ArrayList<>();
        while (times-->0){
            t = n&1;
            a.add(t);
            n=n>>1;
        }

        for (int i=0;i<a.size();i++) {
            res = res<<1;
            res = res | a.get(i);
        }
    return res;
    }

}
