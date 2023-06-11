

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int [] nums ={1,2,3}; 
        int[] ans = getConcatenation(nums);
        for(int i : ans){
            System.out.print(i + " ");
        }
        
    }
     public static int[] getConcatenation(int[] nums) {
        int len = 2 * nums.length;
        int[] arr = new int[len];
    
        int i ;
        for (i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
             arr[i+nums.length] = nums[i];
             
        }
        return arr;
    }
}
