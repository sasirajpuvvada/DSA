package Programs;

import java.util.HashMap;

//205. Isomorphic Strings
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "odd";
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();

        for (int i = 0; i < s.length();i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (map.containsKey(ch1) && map.containsKey(ch2)) {

            }
        }

    }
}
