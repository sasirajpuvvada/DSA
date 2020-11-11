package BinarySearch;

public class Q11MinimumDifferenceFromTarget {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,8,10,10,12,19};
        int target = 12;
        int ans = solve(ar,target);
        System.out.println(ans);
    }

    private static int solve(int[] ar, int target) {

        int start = 0;
        int end = ar.length-1;
        int mid = 0;
        int index = 0;

        while (start <= end) {

            mid = start + (end - start)/2;

            if (ar[mid] == target) {
                return ar[mid];
            } else if (ar[mid] < target) {
                index = mid;
                start = mid + 1;
            } else
                end = mid - 1;

        }

        return Math.min(Math.abs(target-ar[index]),Math.abs(target-ar[index+1]));
    }
}
