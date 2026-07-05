import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new HashSet<>();
        List<Integer> s = new ArrayList<>();
        for(int f:friends)
        {
            set.add(f);
        }
        for(int num:order)
        {
            if(set.contains(num))
            {
                s.add(num);
            }
        }
        int[] result = new int[s.size()];
        for(int i=0; i<s.size(); i++)
        {
            result[i] = s.get(i);
        }
        return result;
    }
}
public class ROrder {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] order = {1, 2, 3, 4, 5};
        int[] friends = {2, 4};
        int[] result = s.recoverOrder(order, friends);
        System.out.println(Arrays.toString(result));
    }
}
