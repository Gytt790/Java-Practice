class Solution
{
    public int[] lengthOfLastWord(String s) {
       int length=0;
       int m=s.length()-1;
       while (m >= 0 && s.charAt(m) == ' ') {
           m--;
       }
       while (m >= 0 && s.charAt(m) != ' ') {
           length++;
           m--;
       }
       return new int[] { length };
    }
}
public class LWord {
    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "Hello World mad";
        int[] result = s.lengthOfLastWord(s1);
        System.out.println(result[0]);
    
    }
}