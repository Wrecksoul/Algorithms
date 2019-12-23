package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2019/12/23
 */
public class BestTimeToBuyAndSellStock {
    /**
     * 解法1 O(n^n)
     *
     * @param prices
     * @return
     */
    /*public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int buyPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sellPrice = prices[j];
                if (buyPrice < sellPrice) {
                    profit = Math.max(sellPrice - buyPrice, profit);
                }
            }
        }

        return profit;
    }*/

    /**
     * 解法2 O(n)
     *
     * @param prices
     * @return
     */
    /*public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int profit = 0;

        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (price < buyPrice) {
                buyPrice = price;
            }else {
                if (price - buyPrice > profit) {
                    profit = price - buyPrice;
                }
            }
        }

        return profit;
    }*/

    /**
     * 解法3 O(n),写法稍有不同但是更快
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }
}
