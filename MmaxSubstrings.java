import java.util.ArrayList;
import java.util.HashSet;

class Solution
{
    public int maxSubstrings(String s) {
      HashSet<Character> uniqueChars = new HashSet<>();
      for (char c : s.toCharArray()) {
          uniqueChars.add(c);
          ArrayList<Character> charList = new ArrayList<>();
          charList.add(c);
          System.out.println(charList);
      }
      return uniqueChars.size();
    }
}
public class MmaxSubstrings {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "abcabc";
        int result = s.maxSubstrings(str);
        System.out.println(result);
    }
}