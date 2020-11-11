package SlidingWindow;

public class Q1MaximumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] ar = {100,200,300,400,500};
        int k = 2;
        int value = solve(ar,k);
        System.out.println(value);
    }

    private static int solve(int[] ar, int k) {

        int s = 0, max = 0;

        for (int i = 0; i < k - 1; i++) {
            s+=ar[i];
        }
        for (int i = k-1 ;i < ar.length;i++) {
            s = s + ar[i];
            if (max < s)
                max = s;
            s = s - ar[i - k + 1];
        }
        return max;
    }
}
