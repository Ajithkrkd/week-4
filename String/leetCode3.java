package String;


public class leetCode3 {
// There is a programming language with only four operations and one variable X:

// ++X and X++ increments the value of the variable X by 1.
// --X and X-- decrements the value of the variable X by 1.
// Initially, the value of X is 0.

// Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
// Input: operations = ["--X","X++","X++"]
// Output: 1
public static void main(String[] args) {
    String [] opp = {"--X","X++","X++"};
    System.out.println(findAfterOpp(opp));
}
public static int findAfterOpp(String [] opp) {
    int x = 0;
    for(int i = 0; i < opp.length; i++){
        if(opp[i].charAt(1)=='+'){
           x++; 
        }else{
            x--;
        }
      
    }
      return x;
}
}
