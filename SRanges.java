import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
      List<String> arraylist=new ArrayList<>();
        int start=nums[0];
      for(int i=1;i<=nums.length;i++)
      {
       if(i==nums.length || nums[i]!=nums[i-1]+1)
       {
        int end=nums[i-1];
       if(start==end)
       {
        arraylist.add(String.valueOf(start));
       }
       else{
        arraylist.add(start + "->" + end);
       }
       if(i<nums.length){
        start=nums[i];
       }
       
      } 
    }
    return arraylist;
    }
}
public class SRanges {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,1,2,4,5,7};
        List<String> result = s.summaryRanges(nums);
        System.out.println(result);
    }
}