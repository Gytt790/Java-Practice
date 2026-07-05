class Solution
{
    public boolean ispowerOfTwo(int n)
    {
        if (n <= 0)
            return false;

        else
            return (n & (n - 1)) == 0;
    }
}
public class Twopower
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int n = 8;
        boolean result = solution.ispowerOfTwo(n);
        System.out.println(n + " is a power of two: " + result);
    }
}