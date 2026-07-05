import java.util.Arrays;

class Solution {
    public int[] countBits(int n) {
        int[] result=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
         int num=i;
         int count=0;
         while(num>0)
         {
            int r=num%2;
            num=num/2;
            if(r==1)
                count++;
         }
         result[i]=count;
        }
        return result;
    }
}
public class Cbits {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.countBits(5);
        System.out.println(Arrays.toString(result));
    }
}