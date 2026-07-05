class Solution {

    public boolean isStrictlyPalindromic(int n) {

        for (int base = 2; base <= n - 2; base++) {

            String converted = convertToBase(n, base);

            if (!isPalindrome(converted)) {
                return false;
            }
        }

        return true;
    }

    private String convertToBase(int n, int base) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % base);
            n = n / base;
        }

        return sb.reverse().toString();
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
public class StrictlyPalindrome{
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 9;
        boolean result = s.isStrictlyPalindromic(n);
        System.out.println(result);
    }
}