package GeeksForGeeksSDE;

import java.util.ArrayList;

public class UnionOfArrays {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i=0,j=0,val,l=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i<n && j<m){

            if (arr1[i]<arr2[j]){
                val=arr1[i];
                i++;
            }else{
                val=arr2[j];
                j++;
            }
            if(ans.size()==0)
                ans.add(val);
            if(ans.get(l)!=val) {
                ans.add(val);
                l++;
            }

        }

        while (i<n){
            val = arr1[i];
            if(ans.get(l)!=val) {
                ans.add(val);
                l++;
            }
            i++;
        }
        while (j<m){
            val = arr2[j];
            if(ans.get(l)!=val) {
                ans.add(val);
                l++;
            }
            j++;
        }
        return ans;
    }

}
