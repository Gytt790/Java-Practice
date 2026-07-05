class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
       for(int i=0;i<s.length();i++)
       {
        int index=s.charAt(i)-'a';
        freq[index]++;
       }
       for(int j=0;j<t.length();j++)
       {
        int index=t.charAt(j)-'a';
        freq[index]--;
       }
       for(int k=0;k<26;k++)
       {
        if(freq[k]!=0)
        {
            return false;
        }
       }
       return true;
    }
}
public class Anagram{
    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "aa";
        String s2 = "a";
        System.out.println(s.isAnagram(s1, s2));
    }
}