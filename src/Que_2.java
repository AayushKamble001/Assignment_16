import java.util.Arrays;

public class Que_2 {
    static String removeDuplicats(String s){
        String ans="";
        s=s.toLowerCase();
        char []ch = s.toCharArray();
        Arrays.sort(ch);
        for (int i=0;i< ch.length-1;i++){
            if (ch[i]==ch[i+1]){
                ans+=ch[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "Apple";
        System.out.println("Input :"+s);
        s=removeDuplicats(s);
        System.out.println("Output :"+s);
    }
}
