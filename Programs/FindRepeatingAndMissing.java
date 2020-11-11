package Programs;

public class FindRepeatingAndMissing {

    //Not Done
    public static void main(String[] args) {

        int ar[] = {1,3,3},sum=0,missing=0;
        int l = ar.length;
        for (int i=0;i<ar.length;i++){
            sum=sum+Math.abs(ar[i]);
            ar[Math.abs(ar[i])-1] = -ar[Math.abs(ar[i])-1];
        }
        for (int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        for (int i=0;i<ar.length;i++){
            if(ar[i]>0)
                missing=ar[i];
        }
        sum=sum-missing;
        sum = (l*(l+1))/2 - sum;
        System.out.println(missing+" "+sum);

    }

}
