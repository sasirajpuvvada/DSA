package Recursion;

public class Q20PrintEncoding {
    public static void main(String[] args) {
        String str = "12";
        solve(str,"");
    }

    private static void solve(String str,String ans) {

        if (str.length()==0)
        {
            System.out.println(ans);
            return;
        } else if (str.length()==1) {
            char ch = str.charAt(0);
            if (ch=='0')
                return;
            else {
                int chv = ch - '0';
                char code = (char)(chv + 'a' - 1);
                System.out.println(ans+code);
            }
            return;
        }

        char ch1 = str.charAt(0);
        String roq = str.substring(1);
        if (ch1!='0') {
            char tans = (char)(ch1-'0'+'a'-1);
            solve(roq,ans+tans);
        } else
            return;

        String ch2 = str.substring(0,2);
        String roq2 = str.substring(2);
        int val = Integer.parseInt(ch2);
        if (val<=26) {
            char code = (char)(val+'a'-1);
           solve(roq2,ans+code);
        }

    }
}
