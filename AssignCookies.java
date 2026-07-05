import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i=0,j=0,count=0;

        while(i<g.length && j<s.length)
        {
            if(s[j]>=g[i])
            {
                count++;
                i++;
                j++;
            }
            else
            j++;
        }
        return count;
    }
}
public class AssignCookies
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int[] a={2,3,5};
        int[] b={3,2};
        int result=s.findContentChildren(a,b);
        System.out.println(result);

    }
}