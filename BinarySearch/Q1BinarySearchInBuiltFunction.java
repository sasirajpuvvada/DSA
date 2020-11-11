package BinarySearch;

import java.util.Arrays;

public class Q1BinarySearchInBuiltFunction {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9};
        int element = 10;
        System.out.println(Arrays.binarySearch(ar,element));
    }
}
