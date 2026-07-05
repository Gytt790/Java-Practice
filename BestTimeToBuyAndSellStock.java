class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int n:prices)
        {
            if(n<minPrice)
            {
                minPrice=n;
            }
            int profit=n-minPrice;
            if(profit>maxProfit)
            {
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = s.maxProfit(prices);
        System.out.println(result);
    }
}