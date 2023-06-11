package String;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("malayalam"));
    }

    public static boolean checkPalindrom(String Word)
    {
        for(int i = 0; i<=Word.length()/2;i++){
            int start = Word.charAt(i);
            int end =  Word.charAt(Word.length()-1-i) ;
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
