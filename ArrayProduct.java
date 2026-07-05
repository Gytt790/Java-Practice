import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        answer[0]=1;
        for(int i=1;i<n;i++)
        {
            answer[i]=answer[i-1]*nums[i-1];
        }
        int right=1;
        for(int j=n-1;j>=0;j--)
        {
            answer[j]=answer[j]*right;
            right=right*nums[j];
        }
        return answer;
    }
}
public class ArrayProduct {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,4};
        int[] result = s.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}