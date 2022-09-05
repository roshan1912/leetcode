class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int T=0;T<=amount;T++){
            if(T%coins[0]==0) dp[0][T]=T/coins[0];
            else dp[0][T] = (int)Math.pow(10,9);
        }
        for(int ind=1;ind<n;ind++){
            for(int t=0;t<=amount;t++){
                int nottake = 0 + dp[ind-1][t];
                int take=(int)Math.pow(10,9);
                if(coins[ind]<=t)
                    take = 1 + dp[ind][t-coins[ind]];
                dp[ind][t]= Math.min(take,nottake);
            }
        }
        int ans = dp[n-1][amount];
        if(ans>=(int)Math.pow(10,9)) return -1;
        return ans;
    }
}