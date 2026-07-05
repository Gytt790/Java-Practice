
import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kollection
{
    public static void main(String[] args)
    {
        Set<Integer>nums = new HashSet<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(8);
        nums.add(1);
        nums.add(3);

        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(1));


        for(int i:nums)
        {
            System.out.println(i);
        }
    }
}