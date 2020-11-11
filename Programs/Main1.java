package Programs;

import java.io.*;
import java.util.*;

public class Main1 {


    static void addNumber(int value,PriorityQueue<Integer> min,PriorityQueue<Integer> max) {

        if (min.size()==0 || min.peek() > value) {
            min.add(value);
        } else {
            max.add(value);
        }

    }

    static void balance(PriorityQueue<Integer> min,PriorityQueue<Integer> max) {

        PriorityQueue<Integer> bigger = min.size() < max.size() ? min : max;
        PriorityQueue<Integer> smaller = min.size() > max.size() ? min : max;

        if(bigger.size() - smaller.size() >=2)
            smaller.add(bigger.poll());

    }

    static double findMedian(PriorityQueue<Integer> min,PriorityQueue<Integer> max) {

        PriorityQueue<Integer> bigger = min.size() < max.size() ? min : max;
        PriorityQueue<Integer> smaller = min.size() > max.size() ? min : max;

        if(bigger.size() - smaller.size() == 0)
            return (double)(smaller.peek() + bigger.peek())/2;
        else
            return bigger.peek();
    }

    static double[] runningMedian(int[] a) {

        double[] ans = new double[a.length];
        PriorityQueue<Integer> min = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> max = new PriorityQueue<Integer>();
        int index = 0;
        for(int val:a) {
            addNumber(val,min,max);
            balance(min,max);
            ans[index++] = findMedian(min,max);
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
