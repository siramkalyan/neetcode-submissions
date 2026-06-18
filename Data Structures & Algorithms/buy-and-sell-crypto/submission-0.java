class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int i = 0;
        int j = 1;
        while(j < prices.length){
            if(prices[i] < prices[j]){
                int profit = prices[j] - prices[i];
                result = Math.max(result, profit);
            }
            else{
                i = j;
            }
            j++;

        }
        return result;
    }
}
