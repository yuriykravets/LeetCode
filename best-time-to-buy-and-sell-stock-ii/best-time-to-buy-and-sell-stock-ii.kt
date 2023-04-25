class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        
        for (i in 1 until prices.size) {
            val profit = prices[i] - prices[i - 1]
            if (profit > 0) {
                maxProfit += profit
            }
        }
        
        return maxProfit
    }
}

