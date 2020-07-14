package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/7/14
 */
public class DistributeCandiesTest {

    @Test
    public void distributeCandies() {
        DistributeCandies test = new DistributeCandies();
        assertEquals(3,test.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        assertEquals(2, test.distributeCandies(new int[]{1, 1, 2, 3}));
    }
}