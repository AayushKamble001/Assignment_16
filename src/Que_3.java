import java.util.Arrays;

public class Que_3 {
    static boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="2552";
        if (checkPalindrome(s)){
            System.out.println("Yes, "+ s + " is a Palindrome");
        }else {
            System.out.println("No, "+s+" is not a Palindrome");
        }
    }
}
