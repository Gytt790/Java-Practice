import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
    
        }
       return false; 
    }
}
public class Duplicate {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,4,5,6,7,8,2,10};
        boolean result = s.containsDuplicate(nums);
        System.out.println(result); 
    }
}