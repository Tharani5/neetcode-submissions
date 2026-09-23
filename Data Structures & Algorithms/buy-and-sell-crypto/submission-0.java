class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            min= Math.min(prices[i],min);
            int sum=prices[i]-min;
            maxprofit=Math.max(sum,maxprofit);
        }
        return maxprofit;
    }
}
