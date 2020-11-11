package AugustChallenge;

public class LengthOFLongestPalindorme {

    public static void main(String[] args) {
        String s = "";
        int[] small = new int[26];
        int[] cap = new int[26];
        char c;
        int count=0,max = 0,i;
        for(i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c>='a' && c<='z'){
                small[c-'a']++;
            }else{
                cap[c-'A']++;
            }
        }

        for(i=0;i<26;i++){
            if(small[i]%2==0)
                count+=small[i];
            if(cap[i]%2==0)
                count+=cap[i];
            if(small[i]%2==1 && small[i]>max){
                max = small[i];
            }
            if(cap[i]%2==1 && cap[i]>max){
                max = cap[i];
            }
        }
    }

}
