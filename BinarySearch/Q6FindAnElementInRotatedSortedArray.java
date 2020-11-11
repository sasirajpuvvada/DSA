package BinarySearch;

import java.sql.SQLOutput;
import java.util.Arrays;

//33. Search in Rotated Sorted Array
public class Q6FindAnElementInRotatedSortedArray {
    public static void main(String[] args) {
        int ar[] = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(RotatedBinarySearch(ar,0,ar.length-1,target));
    }

    private static int RotatedBinarySearch(int[] ar, int start, int end, int target) {

        while (start <= end) {
            int pivot = start + (end - start)/2;
            if (ar[pivot] == target)
                return pivot;
            else if (ar[start] <= ar[pivot]) {
                if (target >= ar[start] && target < ar[pivot])
                    end = pivot -1;
                else
                    start = pivot + 1;
            } else {
                if (target > ar[pivot] && target < ar[end])
                    start = pivot + 1;
                else
                    end = pivot - 1;
            }

        }
        return -1;
    }
}
