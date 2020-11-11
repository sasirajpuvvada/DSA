package Programs;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String str =")()())";
        System.out.print(func(str));
    }

    public static int func(String str) {
        Stack<Character> stack = new Stack<>();
        int i=0,l=str.length(),sum=0;
        while (i<l){
            if (str.charAt(i)=='(')
                stack.push('(');
            else {
                if(stack.size()!=0) {
                    stack.pop();
                    sum+=2;
                }
            }
            i++;
        }
        return sum;
    }

}
