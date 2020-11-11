package TakeUForward;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {

        int n=10;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(new ArrayList<>(list1));
        list1.clear();
        list1.add(1); list1.add(1);
        list.add(new ArrayList<>(list1));
        list1.clear();
        System.out.println(list);
        for (int i=2;i<n;i++){
            list1.add(1);
            for (int j = 1; j <= i-1; j++) {
                int s = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                list1.add(s);
            }
            list1.add(1);
            list.add(new ArrayList<>(list1));
            list1.clear();
        }
        System.out.println(list);

    }
}
