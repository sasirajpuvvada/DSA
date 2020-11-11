package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q2FirstNegativeIntegerInEveryWindowSizeK {
    public static void main(String[] args) {
        int[] ar = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int n = ar.length;
        solve(ar,k,n);
//        System.out.println(value);
    }

    private static void solve(int[] ar, int k, int n) {

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < k - 1; i++) {
            if (ar[i] < 0)
                deque.add(ar[i]);
        }
        for (int i = k - 1; i < n; i++) {
            if (ar[i] < 0)
                deque.add(ar[i]);
            if (!deque.isEmpty())
                System.out.println(deque.peek());
            else
                System.out.println("0");
            if (!deque.isEmpty() && deque.peek()==ar[i-k+1])
                deque.removeFirst();
        }

    }
}
