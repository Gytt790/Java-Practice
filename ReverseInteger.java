class Solution
{
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
           x /= 10;
           
            result = result * 10 + digit;
             if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 || 
               (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
        }
        return result;
    }
}
public class ReverseInteger {
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 123;
        int result = s.reverse(x);
        System.out.println(result);
    }
}