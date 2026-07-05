import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isSelfDividenum(i))
            {
                result.add(i);
            }
        }
        return result;
    }

        private boolean isSelfDividenum(int i)
        {
           int original=i;
            while(i>0)
            {
                int digit = i%10;
                if(digit==0 || original%digit!=0)
                {
                    return false;
                }
                i=i/10;
            }
            return true;
        }
        
    }
    public class SelfDNumber
    {
        public static void main(String[] args)
        {
            Solution s = new Solution();
            int m=1, n=22;
            List<Integer> r=s.selfDividingNumbers(m,n);
            System.out.println(r);
        }
    }