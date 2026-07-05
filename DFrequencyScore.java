class Solution {
    public int digitFrequencyScore(int n) {
        int [] freq=new int[10];
        int score=0;
        if(n==0)
        {
            freq[0]=1;
        }
        while(n>0)
        {
            int digit=n%10;
            freq[digit]++;
            n=n/10;
        }
        for(int d=0;d<10;d++)
        {
            score +=d*freq[d];
        }
        
        return score;
        
    }
}
public class DFrequencyScore {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.digitFrequencyScore(12312));
    }
}