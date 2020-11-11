package TakeUForward;

import java.util.Arrays;
import java.util.Collections;

//53. Leet C0de
public class KadaneAlogorithm {
    public static void main(String[] args) {
        int subMax=0,i,n;
        int[] ar = {-1};
        int max = ar[0];
        n=ar.length;
        for(i=0;i<n;i++){
            subMax = subMax+ar[i];
            if(subMax>max)
                max=subMax;
            if(subMax<0)
                subMax=0;
        }
        System.out.println(max);
    }
}
