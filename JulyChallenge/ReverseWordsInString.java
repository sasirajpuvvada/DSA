package JulyChallenge;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String str = "the sky is blue".trim();
        str = reverseWords(str);
        System.out.print(str);

    }

    public static String reverseWords(String str) {

        String[] s=str.split("[ ]+");
        str ="";
        for(int i=s.length-1;i>=0;i--) {
            str+=s[i]+" ";
        }

        return str;
    }

}
