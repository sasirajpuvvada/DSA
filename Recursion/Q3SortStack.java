package Recursion;

import java.util.*;

public class Q3SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.print(stack);
        sort(stack);
        while (stack.size()!=0)
            System.out.print(stack.pop()+" ");
    }

    private static void sort(Stack<Integer> stack) {

        if(stack.size()==1)
            return;
        else {
            int temp = stack.pop();
            sort(stack);
            insert(stack,temp);
        }

    }

    private static void insert(Stack<Integer> stack, int temp) {

        if (stack.size()==0 || stack.peek()<=temp) {
            stack.push(temp);
        } else {
            int val = stack.pop();
            insert(stack,temp);
            stack.push(val);
        }

    }

}
