package AugustChallenge;


//Day 1
public class DetectCapital {

    public static void main(String[] args) {

        String word="Leetcode";
        System.out.println(new Solution1().detectWord(word));
        System.out.println(new Solution2().detectWord(word));

    }
}

class Solution1{

    public boolean detectWord(String word){

        if(word.length()==1)
            return true;
        String up = word.toUpperCase();
        if(up.equals(word))
            return true;
        String down = word.toLowerCase();
        if(down.equals(word))
            return true;
        String sub = word.substring(1);
        if(sub.equals(sub.toLowerCase()))
            return true;
        return false;

    }

}
class Solution2{

    public boolean detectWord(String word){

        int count=0;
        for(Character c:word.toCharArray()){
            if(Character.isUpperCase(c))
                count++;
        }
        if (count==0 || count==word.length()) return true;
        return count==1 && Character.isUpperCase(word.charAt(0));
    }

}


