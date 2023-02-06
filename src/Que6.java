public class Que6 {
    static boolean traverseFrequency(int []freq){
        for (int i=0;i< freq.length;i++){
            if (freq[i]==0){
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
    static boolean checkPangram(String s){
        s=removeSpace(s);
        s=s.toLowerCase();
        char []arr =toCharArray(s);
        int []freq = new int[26];
        for (int i=0;i<= arr.length-1;i++){
            int a = arr[i]-97;
            freq[a]++;
        }

        boolean check= traverseFrequency(freq);
        return check;
    }
    public static void main(String[] args) {
        String s="The Quick Brown Fox Jumps Over Lazy Dog";
        if (checkPangram(s)){
            System.out.println(s+" is a Pangram");
        }else {
            System.out.println(s+" is not a Pangram");
        }
    }
}
