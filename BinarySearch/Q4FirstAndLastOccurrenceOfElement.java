package BinarySearch;

public class Q4FirstAndLastOccurrenceOfElement {
    public static void main(String[] args) {
        int[] ar = {0,1,2,3,4,4,4,5,6,7,8};
        int element = 4;
        int index = findFirstOccurrence(ar,element);
        int lastIndex = findLastOccurrence(ar,element);
        System.out.println(index+" "+lastIndex);
    }

    private static int findLastOccurrence(int[] ar, int element) {

        int start = 0;
        int end = ar.length - 1;
        int mid;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (ar[mid] == element)
                ans = mid;
            if (ar[mid] <= element)
                start = mid + 1;
            else
                end = mid - 1;

        }
        return ans;
    }

    private static int findFirstOccurrence(int[] ar, int element) {
        int start = 0;
        int end = ar.length - 1;
        int mid;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (ar[mid] == element)
                ans = mid;
            if (ar[mid] >= element)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return ans;
    }
}
