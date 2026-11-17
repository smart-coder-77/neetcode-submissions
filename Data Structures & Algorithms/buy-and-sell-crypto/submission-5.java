class Solution {
    public int maxProfit(int[] prices) {
        int start =0;
        int profit =0;
        for(int end=0;end<prices.length;end++){
             if(prices[end]<prices[start]){
                start = end;
             }
             profit = Math.max(profit,prices[end]-prices[start]);
        }
        return profit;
    }
}
