import java.util.ArrayList;
import java.util.List;

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
     public static boolean isPalindrome(int x) {
       
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;

        List<Integer> l = new ArrayList<Integer>();

        while (x != 0) {
            int digit = x % 10;
            l.add(digit);
            x /= 10;
        }

        for (int i = 0; i < l.size() / 2; i++) {
            if (l.get(i) != l.get(l.size() - 1 - i))
                return false;
        }

        return true;
    }
}
