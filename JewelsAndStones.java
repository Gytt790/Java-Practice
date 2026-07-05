import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       HashMap<String,Integer> map=new HashMap<>();
       for(int i=0;i<jewels.length();i++) 
       {
        map.put(String.valueOf(jewels.charAt(i)), 1);
       }
       int count=0;
       for(int j=0;j<stones.length();j++)
       {
        if(map.containsKey(String.valueOf(stones.charAt(j))))
        {
            count++;
        }
       }
       return count;
    }
}
public class JewelsAndStones {
    public static void main(String[] args) {
        Solution s = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int result = s.numJewelsInStones(jewels, stones);
        System.out.println(result);
    }
}