
public class CealingOfAnumber {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,6};
      System.out.println(cealing(arr, 6));  
    }
    public static int cealing(int [] arr ,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
           int mid = start + (end - start)/2;

           if(arr[mid] == target){
            return arr[mid];
           }
           if(target >arr[mid]){
            start = mid+1;
           }
           else{
            end = mid -1;
           }
        }
        return arr[start];
    }
}
