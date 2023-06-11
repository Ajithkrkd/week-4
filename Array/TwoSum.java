public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {1,2,4,5,6};
        int target = 9;
        int [] ans = twoSum(nums, target);
       
        for(int i : ans){

            System.out.print("["+i+"]");
        }
    }
     public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                    
                }
            }
        }

        return arr;
    }
}

