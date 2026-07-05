import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(int m:nums2)
        {
            if(map.containsKey(m) && map.get(m)>0)
            {
                result.add(m);
                map.put(m,map.get(m)-1);
            }
        }
        int[] output = new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            output[i]=result.get(i);
        }
        return output;
    }
}
public class ArrayIntersec
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        int[] a = {1,5,6,2,3,2};
        int[] b = {2,2,1};
        int[] r = s.intersect(a,b);
        System.out.println(Arrays.toString(r));
    }
}