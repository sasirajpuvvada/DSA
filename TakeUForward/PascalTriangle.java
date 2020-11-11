package TakeUForward;

public class PascalTriangle {
    public static void main(String[] args) {
        int i,j,s=0,n=10;
        int[][] a = new int[n][n];
        a[0][0]=1;
        a[1][1]=1;
        a[1][0]=1;

        for (i = 2; i < n; i++) {
            a[i][0]=1;
            for (j = 1; j <= i-1; j++) {
                s=a[i-1][j-1]+a[i-1][j];
                a[i][j]=s;
            }
            a[i][j]=1;
        }

        for (i=0;i<n;i++){
            for (j=0;j<=i;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }

    }
}
