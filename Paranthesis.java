import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character>map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack <Character> str = new Stack();
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
           {
            str.push(s.charAt(i));
           }
           else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}')
            {
                if(str.isEmpty() || map.get(str.pop())!=s.charAt(i))
                {
                    return false;
                }
            } 
        }  
        return str.isEmpty(); 
    }
}
public class Paranthesis {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "({[]})";
        boolean result = s.isValid(str);
        System.out.println(result);
    }
}