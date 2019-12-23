package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author mengxiangzhe
 * @date 2019/12/23
 */
public class BestTimeToBuyAndSellStock2Test {

    @Test
    public void maxProfit() {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        BestTimeToBuyAndSellStock2 test = new BestTimeToBuyAndSellStock2();
        assertTrue(7 == test.maxProfit(arr));
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        assertTrue(4 == test.maxProfit(arr2));
    }
}