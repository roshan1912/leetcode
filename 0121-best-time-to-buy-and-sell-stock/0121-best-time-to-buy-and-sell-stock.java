class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans=0;
        int start =0;
        int end =1;
        while(start<n && end<n){
            if(prices[start]>prices[end]){
                start = end;
                end++;
            }else{
                ans = Math.max(prices[end]-prices[start],ans);
                end++;
            }
        }
        return ans;

    }
}