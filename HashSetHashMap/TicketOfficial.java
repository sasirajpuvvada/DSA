package HashSetHashMap;

import java.util.*;

public class TicketOfficial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> sources = new HashSet<>();
        HashSet<String> destinations = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();
        String start = "";
        int n = sc.nextInt();
        while (n-- > 0) {
            String src = sc.next();
            String dest = sc.next();
            map.put(src, dest);
            sources.add(src);
            destinations.add(dest);
        }

        for (String st: sources) {
            if (!destinations.contains(st)) {
                start = st;
                break;
            }
        }

        System.out.print(start);
        while (map.containsKey(start)) {
            String curDest = map.get(start);
            System.out.print("->"+curDest);
            start = curDest;
        }


    }
}
