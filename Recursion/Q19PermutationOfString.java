package Recursion;

public class Q19PermutationOfString {
    public static void main(String[] args) {
        String que = "abc";
        String ans = "";
        solve(que,ans);
    }

    private static void solve(String que, String ans) {

        if (que.length()==0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < que.length(); i++) {
            char ch = que.charAt(i);
            String left = que.substring(0,i);
            String right = que.substring(i+1);
            String rem = left + right;
            solve(rem,ans+ch);
        }

    }
}
