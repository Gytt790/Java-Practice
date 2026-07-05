import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length)
        {
            return false;
        }
        HashMap<Character,String> ChartoWords=new HashMap<>();
        HashMap<String,Character> WordstoChar=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String word=words[i];
        if(ChartoWords.containsKey(ch))
        {
            if(!ChartoWords.get(ch).equals(word))
            {
                return false;
            }
        }else
        {
            ChartoWords.put(ch,word);
        }
        if(WordstoChar.containsKey(word))
        {
            if(!WordstoChar.get(word).equals(ch))
            {
                return false;
            }
        }
        else
        {
            WordstoChar.put(word,ch);
        }
        }
        return true;
    }
}

public class VordPattern {
    public static void main(String[] args) {
        Solution s = new Solution();
        String pattern = "abba";
        String a = "dog cat cat dog";
        boolean result = s.wordPattern(pattern, a);
        System.out.println(result);
    }
}
