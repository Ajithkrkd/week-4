

public class Peek{
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,1};
        System.out.println(findPeek(arr));
    }
    public static int findPeek(int []arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] > arr[mid+1] && arr[mid]> arr[mid-1]){
                return arr[mid];
            }else if(arr[mid]<arr[mid+1]){
                start = mid+1; 
            }
            else{
                end = mid -1;
            }
        }
        return start;
    }
}