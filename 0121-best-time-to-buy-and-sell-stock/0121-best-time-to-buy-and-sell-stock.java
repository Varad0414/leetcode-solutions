class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i=0;i<prices.length;i++){
            min = Math.min(prices[i], min);
            int p = prices[i] - min;

            profit = Math.max(profit, p);
        }

        return profit;
    }
}