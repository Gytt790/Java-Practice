import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
public class hDuplicate {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,4,5,6,7,9,10};
        boolean result = s.containsDuplicate(nums);
        System.out.println(result); 
    }
}