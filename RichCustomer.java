class Solution {
    public int maximumWealth(int[][] accounts) {
        int MaxWealth = 0;
        for(int i=0;i<accounts.length;i++)
        {
            int CurrentWealth=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                CurrentWealth=CurrentWealth+accounts[i][j];
            }
            if(MaxWealth<CurrentWealth)
            {
                MaxWealth=CurrentWealth;
            }
        }
            return MaxWealth;
    }
}
public class RichCustomer
{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(s.maximumWealth(accounts));
    }
}