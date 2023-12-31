package recursion;
public class SumOfNAtural {
    public static void main(String[] args) {
        System.out.println(sumOfNAtural(3));
        
    }
    public static int sumOfNAtural(int n) {
        if(n <= 1){
            return n;
        }
        return n + sumOfNAtural(n-1);
        
    }
}
