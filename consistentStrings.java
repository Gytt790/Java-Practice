import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> set=new HashSet<>();
        for(char c: allowed.toCharArray())
        {
            set.add(c);
        }
        int count=0;
        for(String word: words)
        {
            boolean valid=true;
            for(char c: word.toCharArray())
            {
                if(!set.contains(c)) {
                    valid = false;
                    break;
                }
            }if(valid) {
                count++;
            }
        }
        return count;
    }
}
public class consistentStrings
{
    public static void main(String[] args) {
        Solution s = new Solution();
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int result = s.countConsistentStrings(allowed, words);
        System.out.println(result);
    }
}