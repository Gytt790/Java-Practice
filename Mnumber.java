import java.util.Arrays;

class Solution {
        public int missingNumber(int[] nums)
        {
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i+1]-nums[i]!=1)
                {
                    int misn=nums[i]+1;
                     return misn;
                }
               
            }
            return nums.length;
        }
    }
    public class Mnumber
    {
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int[] b={0,1};
        int result=s.missingNumber(b);
        System.out.println(result);
    }
}