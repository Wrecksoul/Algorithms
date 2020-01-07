package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author mengxiangzhe
 * @date 2020/1/3
 */
public class TwoSum2Test {

    @Test
    public void twoSum() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] ints1 = twoSum2.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1, 2}, ints1);

        int[] ints2 = twoSum2.twoSum(new int[]{5, 25, 75}, 100);
        assertArrayEquals(new int[]{2, 3}, ints2);
    }
}