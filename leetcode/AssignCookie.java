package leetcode;

public class AssignCookie {
    
    public static void main(String[] args) {
        
        //i is child ,g[i] greedy factor of the child the minimum number of cookie that child will content
        //j size of cookie , s[j] cookie sizes
        int [] g = new int[]{1,2,3}; 
        int [] s = new int[]{1,1};

        int result  = findChildContent(g, s);
        System.out.println(" total number of child content is  :    " +result  );
    }

    private static int findChildContent(int []g , int []s) {
        
        int contentChild = 0;
        int sPointer = 0;
        int gPointer = 0;

        while (gPointer < g.length && sPointer < s.length) {

            if(g[gPointer] >= s[sPointer]){
                contentChild++;
                gPointer++;
            }
            sPointer++;
            
        }
        
        return contentChild;
    }
}


