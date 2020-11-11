package Recursion;


public class Q15PermutationsOfString {

    public static void main(String[] args) {
        String s = "abcd";
        solve(s,0,3);
    }
    public static void solve(String s,int l,int r) {

        if(l==r) {
            System.out.println(s);
            return;
        }

        for(int i=l;i<=r;i++) {
            s = swap(s,i,l);
            solve(s,l+1,r);
            s = swap(s,i,l);
        }

    }

    public static String swap(String s,int l,int r) {
        char ch[] = s.toCharArray();
        char t = ch[l];
        ch[l] = ch[r];
        ch[r] = t;
        return String.valueOf(ch);
    }
}
