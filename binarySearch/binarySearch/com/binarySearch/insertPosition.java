
// find the inert position of a target 

public class insertPosition {
    public static void main(String[] args) {
        int [] arr = new int []{1,3,4,5};
        
        System.out.println(searchInsert(arr,2));
    }
     public static int searchInsert(int[] nums, int target) {
         
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) {

                return mid; }

            else if (nums[mid] > target){

                end = mid-1;}

            else start = mid+1;
        }

        return start;
    }
    
}
