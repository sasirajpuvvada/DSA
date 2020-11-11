package Programs;

import java.util.HashMap;

//387. First Unique Character in a String
public class LeetCode387 {

    public static void main(String[] args) {

        String str = "loveleetcode";
        System.out.print(solve(str));

    }

    private static int solve(String str) {
        int index=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c:str.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c:str.toCharArray()) {
            if (map.get(c)==1)
                return index;
            index++;
        }
        return -1;
    }

}
