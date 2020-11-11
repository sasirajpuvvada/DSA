package BinarySearch;

public class Q3BinarySearchOnOrderNotKnown {
    public static void main(String[] args) {
        int[] ar = {9,8,7,6,5,4,3,2,1};
        int element = 5;
        int first = ar[0];
        int last = ar[ar.length-1];
        int index;
        if (first <= last) {
            index = findElementAscending(ar, element);
        } else {
            index = findElementDescending(ar,element);
        }
        System.out.println(index);
    }

    private static int findElementDescending(int[] ar, int element) {
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

    private static int findElementAscending(int[] ar, int element) {
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
