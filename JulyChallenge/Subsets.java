package JulyChallenge;

import java.util.*;
//Day 11
public class Subsets {

    public static void main(String[] args) {

        int n,i,j;
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {1,2,3};

//        ans = subsets(nums);
        ans = subsets1(nums,nums.length);
        System.out.println("ans");
        for (i=0;i<ans.size();i++) {
            System.out.println(ans.get(i));
//            for (j=0;j<ans.get(i).size();j++){
//                System.out.print(ans.get(i).get(j)+" ");
//            }
//            System.out.println();
        }



    }

    private static List<List<Integer>> subsets1(int[] nums, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        int i=0,j,k;
        n = (int) (Math.pow(2,n));
        for (i=0;i<n;i++){
            j=i;
            k=0;
            List<Integer> l = new ArrayList<>();
            do {
                if (j%2==1)
                    l.add(nums[k]);
                k++;
                j=j/2;
            }while (j>0);

        ans.add(l);
        }
        return ans;
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int i,j,k,n=nums.length;
        for (i=0;i<n;i++){
            for (j=0;j<=i;j++){
                List<Integer> t = new ArrayList<>();
                for(k=j;k<=i;k++){
                    t.add(nums[k]);
                    System.out.print(nums[k]+" ");
                }
                ans.add(t);
                System.out.println("+");
            }
        }
        return ans;
    }

}
