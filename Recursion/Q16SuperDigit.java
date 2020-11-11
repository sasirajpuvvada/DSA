package Recursion;

//Hackerrank
public class Q16SuperDigit {
    public static void main(String[] args) {
        String str = "123";
        int k=3;
        System.out.println(solve(str,k));
    }

    private static int solve(String str,int k) {

        int sum = 0;
        for (char c:str.toCharArray()) {
            sum += c - '0';
        }
        return add(sum*k);
    }

    private static int add(int sum) {
        if (sum < 10)
            return sum;
        int s = 0;
        while (sum>=0) {
            s = s + sum%10;
            sum/=10;
        }
        return add(s);
    }

}
