class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        minPrice = prices[0]
        maxProfit = 0
        n= len(prices)
        for i in range(0, n):
     
            minPrice = min(prices[i], minPrice)
            maxProfit = max(maxProfit, prices[i] - minPrice)

        return maxProfit
        