package Recursion;

import java.util.Stack;

public class Q5ReverseStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.print(stack);
        reverseStack(stack);
        System.out.print(stack);
    }

    private static void reverseStack(Stack<Integer> stack) {

        if (stack.size()==0){
            return;
        } else {
            int val = stack.pop();
            reverseStack(stack);
            insert(stack,val);
        }

    }

    private static void insert(Stack<Integer> stack, int val) {
        if (stack.size()==0) {
            stack.push(val);
            return;
        }
        else{
            int ele = stack.pop();
            insert(stack,val);
            stack.push(ele);
        }
    }
}
