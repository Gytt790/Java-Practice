import java.util.ArrayList;
import java.util.List;

class Solution
{
    public List<List<Integer>> FindDuplicates(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        for(int num : nums)
        {
            boolean isDuplicate = false;
            for(List<Integer> row : result)
            {
                if(!row.contains(num))
                {
                    row.add(num);
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                List<Integer> newRow = new ArrayList<>();
                newRow.add(num);
                result.add(newRow);
            }
        }
        return result;
    }
}
public class ConvertTo2DArray
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int[] nums = {1, 2, 3, 4, 1,3,3};
        List<List<Integer>> result = s.FindDuplicates(nums);
        System.out.println(result);
    }
}