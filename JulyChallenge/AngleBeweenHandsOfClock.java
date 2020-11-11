package JulyChallenge;

public class AngleBeweenHandsOfClock {



    public static void main(String[] args) {

        int h = 12;
        int m = 0;
        System.out.println(new Solution1().angleClock(h,m));


    }
}

class Solution1 {


    public double angleClock(int h, int m) {

        int minAngle = m*6;
        double hourAngle = (h%12)*30 + m*(0.5);
        double res = Math.abs(hourAngle-minAngle);
        return Math.min(res,360-res);
    }
}
