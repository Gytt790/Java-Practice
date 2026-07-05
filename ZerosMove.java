import java.util.Arrays;

class Solution
{
    public int[] moveZeros(int[] nums)
    {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]!=0)
           {
            nums[j]=nums[i];
            j++;
           }
        }
        while(j<nums.length)
        {
            nums[j]=0;
            j++;
        }
        return nums;
    }
}
public class ZerosMove{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int[] a = {2,0,4,5,0,7};
        int[] result=s.moveZeros(a);
        System.out.println(Arrays.toString(result));

    }
}