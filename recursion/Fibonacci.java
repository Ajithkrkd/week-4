package recursion;
public class Fibonacci {
    public static void main(String[] args) {
        sayHai(5);
    }

    public static void sayHai(int n) {
        System.out.println("hai");
        if(n <=1){
            return;
        }
        sayHai(n-1);
        
    }
}