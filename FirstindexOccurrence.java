class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            int j=0;
            while(j<=needle.length() && haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;
                return i;
            }
        }
        return -1;
    }
}
public class FirstindexOccurrence {
    public static void main(String[] args) {
        Solution s = new Solution();
        String haystack = "sadbutsad";
        String needle = "sado";
        int m= s.strStr(haystack, needle);
        System.out.println(m); // Output: 3
    }
}