import java.util.Arrays;
import java.util.HashMap;

class Solution
{
    public int[]topkFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
       int[] result = new int[k];
       for(int i=0;i<k;i++) {
        int maxfreq = 0;
        int maxkey=0;
        for (int key: map.keySet()) {
            if (map.get(key) > maxfreq) {
                maxfreq = map.get(key);
                maxkey = key;
            }
        }
        result[i] = maxkey;
        map.remove(maxkey);
       }
       return result;
    }
}
public class Elementsk {
   public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        int[] result = s.topkFrequent(nums, k);
        System.out.println(Arrays.toString(result));
   }
}