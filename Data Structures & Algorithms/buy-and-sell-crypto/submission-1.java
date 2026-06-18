class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minBuy = prices[0];
        for(int i =1; i < prices.length; i++){
            int tempProfit = prices[i] - minBuy;
            profit = Math.max(profit, tempProfit);
            minBuy = Math.min(minBuy, prices[i]);
        }
        return profit;
    }
}
