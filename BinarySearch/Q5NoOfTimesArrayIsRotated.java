package BinarySearch;

// Not Working for duplicates in array
public class Q5NoOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] ar = {2, 1, 2, 2, 2};
        int ans = rotatedIndex(ar);
        System.out.println(ans);
    }

    private static int rotatedIndex(int[] ar) {
        int start = 0;
        int end = ar.length - 1;
        int n = ar.length;
        while (start <= end) {
            int pivot = start + (end - start)/2;
            int next = (pivot + 1) % n;
            int prev = (pivot + n - 1) % n;

            if (ar[pivot] <= ar[next] && ar[pivot] < ar[prev])
                return pivot;
            else if (ar[start] == ar[end]) {
                start++;
                end--;
            }
            else if(ar[start] <= ar[pivot])
                start = pivot + 1;
            else if(ar[pivot] <= ar[end])
                end = pivot - 1;
        }
        return 0;
    }
}
