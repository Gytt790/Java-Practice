class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i = 1;i<=num/2;i++)
        {
            if(num%i==0)
            sum += i;
        }
       return true;

    }
}
public class Pnumber
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int n=2016;
        boolean result=s.checkPerfectNumber(n);
        System.out.println(result);
    }
}