package BinarySearch;

//Next Letter and ceil
public class Q9CeilOfElement {
    public static void main(String[] args) {
        char[] ar = {'a','c','f','g'};
        char target = 'f';
        int index = solve(ar,target);
        System.out.println(index);
    }

    private static int solve(char[] ar, int target) {

        int start = 0;
        int end = ar.length-1;
        int mid = 0;
        int ans = 0;

        while (start <= end) {

            mid = start + (end - start)/2;

            if (ar[mid] == target) {
                return mid;
            } else if (ar[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
