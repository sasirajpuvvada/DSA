package BinarySearch;

public class Q1BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9};
        int element = 5;
        int index = findElement(ar,element);
        System.out.println(index);
    }

    private static int findElement(int[] ar, int element) {

        int start = 0;
        int end = ar.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start)/2;

            if (ar[mid] == element)
                return mid;
            else if (ar[mid] > element) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }

        }
        return -1;

    }
}
