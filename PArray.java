import java.util.Arrays;

class Solution
{
    public int[] pivotArray(int[] nums,int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0;
        for (int num : nums) {
            if (num < pivot) {
                result[i++] = num;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                result[i++] = num;
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                result[i++] = num;
            }
        }
        return result;
    }
}
public class PArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] result = s.pivotArray(nums, pivot);

        System.out.println(Arrays.toString(result));;
    }
}