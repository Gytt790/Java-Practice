import java.util.Arrays;

import java.util.HashMap;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap();
        int s[]=new int[2];
        int index=0;
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
               s[index]=i;
index++;
            }
map.put(i,index);
        } 
        return s;
    }
}
public class Digitville
{
    public static void main(String[] args) {
        Solution a = new Solution();
        int[] nums = {1, 1, 2, 4, 5, 5};
        int[] result = a.getSneakyNumbers(nums);
        System.out.println(Arrays.toString(result));
    }
}