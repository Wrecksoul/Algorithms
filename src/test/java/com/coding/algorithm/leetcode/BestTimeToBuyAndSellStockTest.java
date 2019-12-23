package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author mengxiangzhe
 * @date 2019/12/23
 */
public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();
        assertTrue(5 == test.maxProfit(arr));
    }
}