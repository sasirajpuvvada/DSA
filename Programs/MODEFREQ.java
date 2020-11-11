package Programs;

import java.util.HashMap;
import java.util.Map;

public class MODEFREQ {
    public static void main(String[] args) {

        int t,n;
        t=2;
        int[] ar = {5, 9 ,2, 9, 7, 2, 5, 3, 1};
        n = ar.length;
        System.out.println(solve(ar,n));
    }

    private static int solve(int[] ar,int n) {

        int maxMod = 0,min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:ar) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            int key = map.get(i);
            if(maxMod<key)
                maxMod = key;
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()==maxMod)
                if(min > entry.getKey())
                    min = entry.getKey();
        }
        return min;
    }

}
