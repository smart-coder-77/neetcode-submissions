class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int j=0;
        Integer minSoFar = Integer.MAX_VALUE;
       while(j<prices.length){
            if(minSoFar>prices[j]){
                minSoFar = prices[j];
            }
            int current = prices[j]-minSoFar;
            if(current>profit){
                profit= current;
            }
            j++;
        }
        return profit;
    }
}
