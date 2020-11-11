package Recursion;

import java.util.*;

public class Q4DeleteMiddleElementFromStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(1);
        stack.push(0);
        stack.push(5);
        stack.push(2);
//        stack.push(7);
        int middle = stack.size()/2 + 1;
        deleteElement(stack,middle);
        System.out.print(stack);
    }

    private static void deleteElement(Stack<Integer> stack, int middle) {

        if(1==middle) {
            stack.pop();
            return;
        } else {
            int val = stack.pop();
            deleteElement(stack,middle-1);
            stack.push(val);
        }

    }

}
