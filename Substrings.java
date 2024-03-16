public class Substrings {
    public static int countGoodSubstrings(String s) {
        int out = 0;
        for(int i=0; i<s.length()-2; i++){
            String temp = s.substring(i,i+3);
            char a = temp.charAt(0);
            char b = temp.charAt(1);
            char c = temp.charAt(2);
            if(a!=b && b!=c && a!=c){
                out++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
    }
}
