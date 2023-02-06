public class Que_4 {
    static int countConsonants(String s){
        s=s.toLowerCase();
        int count=0;
        for (int i=0;i<s.length();i++){
            if (!vowels(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    static int countVowels(String s){
        s=s.toLowerCase();
        int count=0;
        for (int i=0;i<s.length();i++){
            if (vowels(s.charAt(i))){
               count++;
            }
        }
        return count;
    }
    static boolean vowels(char ch){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s ="Ayush";
        int vowels=countVowels(s);
        int consonants=countConsonants(s);
        System.out.println(s);
        System.out.println("Vowels :"+vowels);
        System.out.println("Consonants :"+consonants);
    }
}
