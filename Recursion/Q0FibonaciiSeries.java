package Recursion;

public class Q0FibonaciiSeries {

    private static int[] fib = new int[100];

    public static void main(String[] args) {
        int n=4;

        for(int i=0;i<=n;i++)
        fib[i]=-1;

        System.out.print(solve(n));
        for(int i=0;i<=10;i++)
        System.out.print(fib[i]+" ");
    }

    private static int solve(int n) {

        if (n==1|| n==0) {
            fib[n] = n;
            return n;
        }
        else {
            if (fib[n-2]==-1)
                fib[n-2] = solve(n-2);
            if (fib[n-1]==-1)
                fib[n-1] = solve(n-1);
            fib[n] = fib[n-2] + fib[n-1];
            return fib[n-2]+fib[n-1];
        }

    }


}
