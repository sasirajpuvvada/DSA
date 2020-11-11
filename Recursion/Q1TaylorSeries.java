package Recursion;




public class Q1TaylorSeries {

    static int f=1,p=1;

    public static void main(String[] args) {
        int x=1,n=10;
//        System.out.print(taylorSeries(x,n));    //solution 1
        System.out.print(taylorSeries2(x,n));       //solution 2
    }

    private static double taylorSeries2(int x, int n) {

        double r = 0;
        if (n==0)
            return 1;
        else{
            r = taylorSeries2(x,n-1);
            p=p*x;
            f=f*n;
            return r + (double) p/f;
        }


    }

    private static double taylorSeries(int x,int n) {

        if (n==0)
            return 1;
        else {
            return taylorSeries(x,n-1) + pow(x,n)/fat(n);
        }

    }

    private static double pow(int x,int n) {
        if(n==0)
            return 1;
        if(n%2==0)
            return pow(x*x,n/2);
        return x*pow(x*x,(n-1)/2);
    }

    private static double fat(int n){
        if (n==0)
            return 1;
        else
            return n*fat(n-1);
    }


}
