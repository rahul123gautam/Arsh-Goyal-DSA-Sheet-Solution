Problem Lin:- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/




                       ************************CODE************************
                       
                         
                         
                         
 class Solution {
    public int maxProfit(int[] prices) {
        int max = 0 , n = prices.length , maxProfit = 0;
        for(int i = n-1; i >= 0; i--){
            if(i != n-1){
                int temp = prices[i];
                prices[i] = max - temp;
                if(max < temp) max = temp;
                if(prices[i] > maxProfit) maxProfit = prices[i];
            }else max = prices[i];
        }
        return maxProfit;
    }
}
