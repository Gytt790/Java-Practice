class Solution
{
    public boolean isPerfectSqr(int num)
    {
        if (num < 0) return false;
        long left = 0, right = num;
        while (left <= right)
        {
            long mid = left + (right - left) / 2;
            long sqr = mid * mid;

            if (sqr == num)
                return true;
            if (sqr < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
public class PerfectSqr
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int n=81;
        boolean result=s.isPerfectSqr(n);
        System.out.println(result);
    }
}