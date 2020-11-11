package Heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//Mark: TODO
public class Q6FrequencySort {

    static class Pair {
        int count;
        char val;

        Pair(int count,char val) {
            this.count = count;
            this.val = val;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Pair> pr = new PriorityQueue<>(
                new Comparator<Pair>() {
                    @Override
                    public int compare(Pair o1, Pair o2) {
                        if (o2.count == o1.count)
                            return -1;
                        return o2.count - o1.count;
                    }
                }
        );

        String str = "cccaaa";
        char[] ar = str.toCharArray();
        int n = ar.length;
        solve(ar,n,pr);
        String ans = "";
        while (!pr.isEmpty()) {
            Pair pair = pr.poll();
            int freq = pair.count;
            char val = pair.val;
            while (freq-- > 0) {
                ans = ans + val;
            }
        }
        System.out.print(ans);

    }

    public static void solve(char[] ar, int n,PriorityQueue pr) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i < n;i ++)
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            Pair p = new Pair(entry.getValue(),entry.getKey());
            pr.add(p);
        }

    }


}
