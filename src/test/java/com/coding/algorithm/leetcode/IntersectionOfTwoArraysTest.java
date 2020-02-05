package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/2/5
 */
public class IntersectionOfTwoArraysTest {

    @Test
    public void intersection() {
        IntersectionOfTwoArrays test = new IntersectionOfTwoArrays();
        int[] r1 = test.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        assertArrayEquals(new int[]{2}, r1);

        int[] r2 = test.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        assertArrayEquals(new int[]{4, 9}, r2);
    }
}