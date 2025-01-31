package slidingWindow

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var left = 0
        var right = 1
        var maxP = 0
        var temp:Int
        while (right < prices.size){
            if (prices[left] < prices[right]){
                temp = prices[right] - prices[left]
                maxP = maxOf(maxP,temp)
            }else{
                left = right
            }
            right++
        }

        return maxP
    }
}