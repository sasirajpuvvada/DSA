package JulyChallenge;

//day 1
class Solution {
    public int arrangeCoins(int n) {

        return (int)(Math.sqrt((long)2*n+0.25)-0.5);

        // int i=1,k,c=1;
        // while(c<=n) {
        //     c+=1;
        //     n=n-i;
        // }
        // return c;
    }
}
