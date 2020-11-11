package Heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q9KthSmallestElementInMatrix {

    public static void main(String[] args) {

        int matrix[][] = {
                { 1,  5,  9},
                {10, 11, 13},
                {12, 13, 15}
                };
        int k = 8;

        k = kthSmallestElement(matrix,k);
        System.out.println(k);

    }

    private static int kthSmallestElement(int[][] matrix, int k) {

        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                pr.add(matrix[i][j]);
                if (pr.size()>k)
                    pr.poll();
            }
        }
    return pr.poll();
    }



}
