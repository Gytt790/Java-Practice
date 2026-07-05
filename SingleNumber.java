import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                int target = nums[i];
            }

        }
        return nums[nums.length-1];
    }
}
public class SingleNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,2,1};
        int result = s.singleNumber(nums);
        System.out.println(result);
    }
}