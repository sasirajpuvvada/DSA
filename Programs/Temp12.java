package Programs;

import java.util.PriorityQueue;
import java.util.Scanner;

// heap
public class Temp12 {

    public static void main(String[] args) {
        int t,o,val;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        while(t-- > 0) {
            o = sc.nextInt();
            if(o < 3) {
                val = sc.nextInt();
                System.out.println(o+" "+val);
                if(o==1)
                    minHeap.add(val);
                else
                    minHeap.remove(val);
                System.out.println(minHeap);
            } else {
                System.out.println(minHeap.peek());
            }
        }
    }
}
