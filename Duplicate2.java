class Solution {
    public boolean containsDuplicate(int[] nums,int k) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && Math.abs(i-j)<=k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
public class Duplicate2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean result = s.containsDuplicate(nums,k);
        System.out.println(result); 
    }
}