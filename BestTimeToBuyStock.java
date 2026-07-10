// Problem: Best Time to Buy and Sell Stock (#121)
// Difficulty: Easy
// Pattern: Single Pass — Track Minimum
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
//
// Approach 1: My first approach — ArrayList + Collections.sort()
// Time: O(n log n) | Space: O(n)
//
// Approach 2: Optimised — Single pass track minimum
// Time: O(n) | Space: O(1)

class BestTimeToBuyStock {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
