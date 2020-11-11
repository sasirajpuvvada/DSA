package BinarySearch;

public class Q7SearchInNearlySortedArray {
    public static void main(String[] args) {
        int[] ar = {10, 3, 40, 20, 50, 80, 70};
        int target = 90;
        System.out.println(findIndex(ar,target));
    }

    private static int findIndex(int[] ar, int target) {

        int start = 0;
        int end = ar.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (ar[mid] == target)
                return mid;
            else if (mid > start &&ar[mid-1] == target)
                return mid - 1;
            else if (mid < end && ar[mid+1] == target)
                return  mid + 1;

            if (ar[mid]>target)
                end = mid - 2;
            else
                start = mid + 2;
        }

        return -1;
    }
}
