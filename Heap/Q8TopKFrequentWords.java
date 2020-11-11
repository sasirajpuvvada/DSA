package Heap;

import java.util.*;

public class Q8TopKFrequentWords {

    static class Pair {
        int key;
        String val;

        public Pair(int freq, String val) {
            this.key = freq;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        String[] str = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> ans = topKFrequentWords(str,k);

        System.out.print(ans);
    }

    private static List<String> topKFrequentWords(String[] str, int k) {

        List<String> list = new ArrayList<>();
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
                new Comparator<Pair>() {
                    @Override
                    public int compare(Pair o1, Pair o2) {
                        if (o1.key == o2.key)
                            return o2.val.compareTo(o1.val);
                        return o1.key - o2.key;
                    }
                }
        );

        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i],map.getOrDefault(str[i],0)+1);
        }


        for (Map.Entry<String,Integer> entry : map.entrySet() ) {

            int freq = entry.getValue();
            String val = entry.getKey();
            Pair p = new Pair(freq,val);
            minHeap.add(p);
            if (minHeap.size() > k)
                minHeap.poll();

        }

        while (!minHeap.isEmpty())
            list.add(minHeap.poll().val);
        Collections.reverse(list);
        return list;
    }
}
