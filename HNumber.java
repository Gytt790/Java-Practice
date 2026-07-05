import java.util.HashSet;
import java.util.Set;

class Solution
{
    public boolean isHappy(int n)
    {
       Set<Integer> set = new HashSet<>();
        while(n!=1)
        {
            if(set.contains(n))
            {
            return false;
            }
            int sum=0;
        while(n>0)
        {
            int digit=n%10;
            int sqr=digit*digit;
            sum+=sqr;
            n=n/10;

        }
        n=sum;
    }
    return true;
    }
}
public class HNumber
{
    public static void main(String[] args)
    {
        Solution s= new Solution();
        int n=19;
         boolean result=s.isHappy(n);
        System.out.println(result);
    }
}