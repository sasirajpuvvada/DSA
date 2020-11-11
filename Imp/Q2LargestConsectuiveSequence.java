package Imp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Q2LargestConsectuiveSequence {
    public static void main(String[] args) {
        int[] ar = {1,102,101,100,4};
        HashSet<Integer> hash = new HashSet<>();
        for (int a:ar)
            hash.add(a);
        int value = solve(hash);
        System.out.println(value);
    }

    private static int solve(HashSet<Integer> hash) {
        int max = 0, curMax = 0;

        Iterator<Integer> it = hash.iterator();

        while (it.hasNext()) {
            curMax = 1;
            int val = it.next();
            if (hash.contains(val - 1)) {
                continue;
            } else {
                while (hash.contains(val+1)) {
                    curMax++;
                    val++;
                }
            }
            max = Math.max(curMax, max);
        }
        return max;
    }
}
