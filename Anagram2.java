import java.util.HashMap;

class Solution
{
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }else
            map.put(c,1);
        }
        
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int j=0;j<t.length();j++) {
            char d=t.charAt(j);
            if(map2.containsKey(d)) {
                map2.put(d,map.get(d)+1);
            }else
            map2.put(d,1);
        }
        if(map.equals(map2)) {
            return true;
        }
        return false;
    }
}
public class Anagram2{
    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "aa";
        String s2 = "a";
        System.out.println(s.isAnagram(s1, s2));
    }
}