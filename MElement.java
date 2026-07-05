import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        float r = n / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int m : nums) {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > r) {
                return key;
            }
        }
        return -1;
    }
}
public class MElement {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        int result = s.majorityElement(nums);
        System.out.println(result);
    }
}