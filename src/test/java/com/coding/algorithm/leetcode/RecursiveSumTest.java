package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2019/12/13
 */
public class RecursiveSumTest {

    @Test
    public void sum() {
        RecursiveSum recursiveSum = new RecursiveSum();
        int[] nums = new int[]{1,2,3,4,1,9,-1};
        assertTrue(19 == recursiveSum.sum(nums));
    }
}