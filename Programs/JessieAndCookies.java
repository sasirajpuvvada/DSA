package Programs;

import java.util.PriorityQueue;

public class JessieAndCookies {
    public static void main(String[] args) {
        long[] ar = {1,2,3,9,10};
        long k=7;
        System.out.println(cookiesfunc(ar,k));
    }

    static int cookiesfunc(long[] ar,long k) {

        if(ar.length==0 ||(ar.length==1 && ar[0] < k) )
            return -1;

        int count = 0;
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for (long val:ar)
            minHeap.add(val);

        long min = minHeap.peek();
        while (minHeap.size()>1 && min<k) {
            minHeap.add(minHeap.poll() + 2*minHeap.poll());
            count++;
            min = minHeap.peek();
        }
        if (minHeap.size()==1 && min<k)
            return -1;
        return count;

    }

}
