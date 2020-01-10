package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/1/10
 */
public class NumberOf1BitsTest {

    @Test
    public void hammingWeight() {
        NumberOf1Bits test = new NumberOf1Bits();
        assertEquals(3, test.hammingWeight(11));
    }
}