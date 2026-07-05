import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result =  new HashSet<>();

        for(int i:nums1)
        {
            set.add(i);
        }
        for(int j:nums2)
        {
            if(set.contains(j))
            {
                result.add(j);
            }
        }
        int[] ans = new int[result.size()];
        int k = 0;
        for(int num:result)
        {
            ans[k]=num;
            k++;
        }
       return ans; 
    }
}
public class TwoArraysIntersection
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int[] a={2,5,6,8,10,45};
        int[] b={3,6,9,20,34,8};
        int[] result=s.intersection(a,b);
        System.out.println(Arrays.toString(result));
    }
}