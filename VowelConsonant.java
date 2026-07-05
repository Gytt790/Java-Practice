import java.util.HashMap;

class solution
{
    public int maxfreqSum(String s)
    {
        HashMap<Character, Integer> Vowelmap = new HashMap<>();
        Vowelmap.put('a', 0);
        Vowelmap.put('e', 0);
        Vowelmap.put('i', 0);
        Vowelmap.put('o', 0);
        Vowelmap.put('u', 0);

        HashMap<Character, Integer> consonantMap = new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(Vowelmap.containsKey(c))
            {
                Vowelmap.put(c, Vowelmap.get(c) + 1);
            }
            else
            {
                consonantMap.put(c, consonantMap.getOrDefault(c, 0) + 1);
            }
        }
        int maxVowel=0;
        for(int n:Vowelmap.values())
        {
            maxVowel = Math.max(maxVowel, n);
        }
        int maxConsonant = 0;
        for(int m:consonantMap.values())
        {
            maxConsonant=Math.max(maxConsonant, m);
        }
        return maxVowel + maxConsonant;
    }
}
public class VowelConsonant {
    public static void main(String[] args) {
        solution s = new solution();
        String input = "aeiaeia";
        int result = s.maxfreqSum(input);
        System.out.println(result);
        
    }
}