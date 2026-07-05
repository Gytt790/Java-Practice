class Solution
{
    public boolean isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }

        String value = Integer.toString(x);
        StringBuilder sb = new StringBuilder(value);
        String reversed = sb.reverse().toString();
        return value.equals(reversed);
    }
}
public class palindromex
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int x = 121; // Example input
        boolean result = solution.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
    }
}
