import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roadmap = new HashMap<>();
        roadmap.put('I', 1);
        roadmap.put('V', 5);
        roadmap.put('X', 10);
        roadmap.put('L', 50);
        roadmap.put('C', 100);
        roadmap.put('D', 500);
        roadmap.put('M', 1000);

        int total=0;

        for(int i=0;i<s.length();i++)
        {
            int currentvalue = roadmap.get(s.charAt(i));

        if((i+1)<s.length() && currentvalue<roadmap.get(s.charAt(i+1)))
        {
            total -= currentvalue;

        }
        else
        {
            total += currentvalue;

        }
        }
        return total;

        
    }
}
public class Leetcode
{
   public static void main(String[] args){
    Solution s = new Solution();
    String str = "";
    int result = s.romanToInt(str);
    System.out.println(result);
   } 
}
     