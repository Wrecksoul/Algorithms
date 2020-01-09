package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2019/12/12
 */
public class MaximumSubarrayTest {

    @Test
    public void maxSubArray() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int maxSum = maximumSubarray.maxSubArray(new int[]{87, 2, -4, 4, 3, 93});
        assertTrue(maxSum == 185);
        int maxSum2 = maximumSubarray.maxSubArray(new int[]{-1, 2, -4, 4, 3, 93});
        assertTrue(maxSum2 == 100);
    }
}