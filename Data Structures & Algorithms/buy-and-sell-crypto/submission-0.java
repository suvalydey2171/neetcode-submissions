class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int max=prices[prices.length-1];
        int maxp=0;
        for(int i=prices.length-1; i>=0; i--)
        {
            if(prices[i]>max) max=prices[i];
            else{
                maxp=Math.max(maxp,max-prices[i]);
            }
        }
        return maxp;
    }
}
