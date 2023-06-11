public class Demo {

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
    }

    static int factorialOfNumber(int n) {
        
        if (n <= 1) {
            return n;
        }else{
            return  n*(factorialOfNumber(n-1));
        }
       
    }
}
