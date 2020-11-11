package BinarySearch;

public class Q8FloorOfElement {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,8,10,10,12,19};
        int target = 3;
        int index = solve(ar,target);
        System.out.println(index);
    }

    private static int solve(int[] ar, int target) {

        int start = 0;
        int end = ar.length-1;
        int mid = 0;
        int ans = 0;

        while (start <= end) {

            mid = start + (end - start)/2;

            if (ar[mid] == target) {
                return mid;
            } else if (ar[mid] < target) {
                ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;

        }
        return ans;
    }
}
