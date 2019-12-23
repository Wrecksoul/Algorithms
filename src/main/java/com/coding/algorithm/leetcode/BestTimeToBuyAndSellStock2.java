package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2019/12/23
 */
public class BestTimeToBuyAndSellStock2 {
    /**
     * O(n),发现其实就是把后数-前数的差如果大于0就加起来
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            profit += Math.max(prices[i + 1] - prices[i],0);
        }
        return profit;
    }
}
