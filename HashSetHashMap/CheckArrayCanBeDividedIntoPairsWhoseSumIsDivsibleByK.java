package HashSetHashMap;

import java.util.*;

public class CheckArrayCanBeDividedIntoPairsWhoseSumIsDivsibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        boolean flag = true;
        n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = ar[i];
            value = value % k;
            int rmf = map.getOrDefault(value,0);
            map.put(value, rmf +1 );
        }


        for (int rm: ar) {
            rm = rm % k;
            if (rm == 0 && map.get(rm)%2!=0) {
                flag = false;
            }
            else if (2*rm == k && map.get(rm)%2!=0) {
                flag = false;
            }
            else {
                if (!map.get(rm).equals(map.getOrDefault(k - rm, 0))) {
                    flag = false;
                }
            }

        }
        System.out.println(flag);

    }
}
