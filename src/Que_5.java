import java.util.Arrays;

public class Que_5 {
    static boolean compareArray(char []arr1, char[]arr2){
        for (int i=0;i< arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    static char [] toCharArray(String s){
        char []arr=new char[s.length()];
        for (int i=0;i< arr.length;i++){
            arr[i]=s.charAt(i);
        }
        return arr;
    }

    static String removeSpace(String s){
        String ans="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=0){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    static boolean anagram(String s1, String s2){

        s1=removeSpace(s1);
        s2=removeSpace(s2);

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char []arr1=toCharArray(s1);
        char []arr2=toCharArray(s2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (compareArray(arr1,arr2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="keep";
        String s2="Peek";
        if (anagram(s1,s2)){
            System.out.println(s1+" "+s2+" are Anagram");
        }else {
            System.out.println(s1+" "+s2+" are not Anagram");
        }
    }
}
