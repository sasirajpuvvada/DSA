package Recursion;

import java.util.ArrayList;
import java.util.Arrays;


public class Q2SortArray {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,5,0,2));
        sort(ar);
        for (int i:ar)
            System.out.print(i+ " ");
    }

    private static void sort(ArrayList<Integer> ar) {

        if (ar.size()==1) {
            return;
        } else {
            int temp = ar.remove(ar.size()-1);
            sort(ar);
            insert(ar,temp);
        }

    }

    private static void insert(ArrayList<Integer> ar, int temp) {

        if (ar.size()==0||ar.get(ar.size()-1)<=temp){
            ar.add(temp);
        } else {
            int val = ar.remove(ar.size()-1);
            insert(ar,temp);
            ar.add(val);
        }

    }


}
