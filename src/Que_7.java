import java.util.Arrays;

public class Que_7 {
    static boolean unique(String s){
        s=s.toLowerCase();
        char []ch = s.toCharArray();
        Arrays.sort(ch);
        for (int i=0;i< ch.length-1;i++){
            if (ch[i]==ch[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="abcd";
        if (unique(s)){
            System.out.println(s+" contains all unique elements");
        }else {
            System.out.println(s+" does not contains all unique elements");
        }
    }
}
