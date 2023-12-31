package String;


 class LeetCode1 {
public static void main(String[] args) {
    System.out.println(numJewelsInStones("aabbaa", "ab"));
}
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }

        return count;
    }
        
}     

