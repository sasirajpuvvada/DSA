package Programs;

import java.util.Stack;

//leetcode
public class Parentheses {

    public static void main(String[] args) {

        String str="{[]}";
        System.out.print(isValid(str));

    }

    private static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();
        int i,j,n=str.length();
        for (i=0;i<n;i++) {
            if (str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{') {
                stack.push(str.charAt(i));
            } else {
                if (stack.size()==0)
                    return false;
                Character c = stack.pop();
                if (c=='(' && str.charAt(i)==')')
                    continue;
                else if (c=='[' && str.charAt(i)==']')
                    continue;
                else if (c=='{' && str.charAt(i)=='}')
                    continue;
                else
                    return false;
            }
        }
        if (stack.size()==0)
            return true;
        return false;
    }

}
