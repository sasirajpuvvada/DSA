package GeeksForGeeksSDE;

public class EquilibriumPoint {
    public static void main(String[] args) {

        int i,n=0;
        long ar[] = new long[n];
        long a[] = new long[n];
        long s=0;
        for(i=0;i<n;i++){
            s=s+a[i];
            ar[i]=a[i];
            a[i]=s;
        }
        s=0;
        for(i=n-1;i>=0;i--){
            s=s+ar[i];
            ar[i]=s;
        }
        for(i=0;i<n;i++)
            if(a[i]==ar[i])
                System.out.println(i);
        System.out.println(i);
    }
    //solution 2
    public static void solution2(){
        long sum=0,sumtot = 0,n = 0;
        long ar[] = new long[(int) n];
        for (int i = 0; i < n ; i++) {
            sumtot = sumtot+ar[i];
        }
        for (int i = 0; i < n; i++) {
            sumtot = sumtot - ar[i];
            sum=sum+ar[i];
            if(sumtot+ar[i]==sum)
                System.out.println(i);
        }
        System.out.println(-1);

    }
}
