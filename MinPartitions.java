class Solution
{
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i)-'0';
            if(digit>maxDigit) {
                maxDigit = digit;
            }
        }
        return maxDigit;
    }
}
class MinPartitions {
    public static void main(String[] args) {
        Solution s = new Solution();
        String n = "32";
        int result = s.minPartitions(n);
        System.out.println(result);
    }
}