


public class FindTarget{
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5,6};
        int target =6;
        System.out.println(findTarget(arr , target));
    }

    public static int findTarget(int [] arr ,int target) {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + end;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        }
        return -1;
    }
}
