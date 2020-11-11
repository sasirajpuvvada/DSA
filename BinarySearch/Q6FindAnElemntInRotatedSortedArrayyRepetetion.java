package BinarySearch;

public class Q6FindAnElemntInRotatedSortedArrayyRepetetion {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 6;
        boolean ans = RotatedBinarySearch(nums,0,nums.length-1,target);
        System.out.println(ans);
    }

    private static boolean RotatedBinarySearch(int[] ar, int start, int end, int target) {

        while (start <= end) {
            int pivot = start + (end - start)/2;
            if (ar[pivot] == target)
                return true;
            if(ar[pivot] == ar[start] && ar[pivot]==ar[end]) {
                start++;
                end--;
            }
            else if (ar[start] <= ar[pivot]) {
                if (target >= ar[start] && target < ar[pivot])
                    end = pivot - 1;
                else
                    start = pivot + 1;
            } else {
                if (target > ar[pivot] && target <= ar[end])
                    start = pivot + 1;
                else
                    end = pivot - 1;
            }

        }
        return false;
    }

}
