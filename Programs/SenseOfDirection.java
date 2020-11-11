package Programs;

import java.util.ArrayList;
import java.util.List;

public class SenseOfDirection {
    public static void main(String[] args) {
        int n ,p,q;
        n = 4;
        p = 2;
        q = 3;
        int ans = solve(n,p,q);
        System.out.println(ans);
    }

    private static int solve(int n, int p, int q) {
        ArrayList<Integer> path1 = new ArrayList<>();
        int ans = 0;
        if (p==q)
            return 0;
        if (q==1) {
            while (p > 1) {
                p = p/2;
                ans++;
                return (ans - 1) * n;
            }
        } else {
            while (q != 1 && q!=p) {
                path1.add(q);
                q = q/2;
                ans++;
            }
            if (q==p)
                return ans * n;
            else {
                while (p!=1 && !path1.contains(p)) {
                    p=p/2;
                    ans++;
                }
            }
        }
        return (ans-1) * n;
    }
}
