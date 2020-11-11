package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q11LastStoneWeight {

    public static void main(String[] args) {
        int[] ar = {2,7,4,1,8,1};
        int k = weight(ar);
        System.out.println(k);
    }

    private static int weight(int[] ar) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int val:ar)
            maxHeap.add(val);

        while (maxHeap.size()>1){
            int x1 = maxHeap.poll() - maxHeap.poll();;
            if (x1!=0)
                maxHeap.add(x1);
        }
        if (maxHeap.size()==0)
            return 0;
        return maxHeap.poll();
    }
}
