package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mengxiangzhe
 * @date 2020/1/10
 */
public class HouseRobberTest {

    @Test
    public void rob() {
        HouseRobber test = new HouseRobber();
        assertEquals(4, test.rob(new int[]{2, 1, 1, 2}));
        assertEquals(4, test.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, test.rob(new int[]{2, 7, 9, 3, 1}));
        assertEquals(500, test.rob(new int[]{200, 7, 9, 300, 1}));
    }
}