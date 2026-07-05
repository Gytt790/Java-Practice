class Solution {
    public boolean isPowerOfThree(int n) {
        
        while(n%3==0)
        {
            n=n/3;
            
    }
    return n==1;
}
}
public class Threepower
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int m=45;
        boolean result = s.isPowerOfThree(m);
        System.out.println(result);
    }
}