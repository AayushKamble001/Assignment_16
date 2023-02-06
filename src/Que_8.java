public class Que_8 {
    static char countOccurrence(String s){
        int count=0;
        s=s.replace(" ","");
        s=s.toLowerCase();
        char []arr = s.toCharArray();
        int []freq = new int[26];
        for (int i=0;i< arr.length;i++){
            int a = arr[i]-97;
            freq[a]++;
        }
        int x=Integer.MIN_VALUE;
        int y = 0;
        for (int i=0;i< freq.length;i++){
            if (x<freq[i]){
                x=freq[i];
                y=i;
            }
        }
        char ans= (char) (y+97);
        return ans;
    }

    public static void main(String[] args) {
        String s ="Aayush";
        char ans=countOccurrence(s);

        System.out.println(ans);
    }
}
