package BinarySearch;

public class Q2BinarySearchOnReverseSortedArray {
    public static void main(String[] args) {
        int[] ar1 = {9,8,7,6,5,4,3,2,1,0};
        int element = 0;
        int index = findElement(ar1,element);
        System.out.println(index);
    }

    private static int findElement(int[] ar, int element) {

        int start = 0;
        int end = ar.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (ar[mid] == element) {
                return mid;
            } else if(ar[mid] > element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
