package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author mengxiangzhe
 * @date 2020/2/4
 */
public class UglyNumberTest {

    @Test
    public void isUgly() {
        UglyNumber test = new UglyNumber();
        assertTrue(test.isUgly(6));
        assertTrue(test.isUgly(8));
        assertFalse(test.isUgly(14));
    }
}