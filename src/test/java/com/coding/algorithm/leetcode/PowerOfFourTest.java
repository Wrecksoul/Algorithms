package com.coding.algorithm.leetcode;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/2/4
 */
public class PowerOfFourTest {

    @Test
    public void isPowerOfFour() {
        PowerOfFour test = new PowerOfFour();
        assertTrue(test.isPowerOfFour(16));
        assertTrue(test.isPowerOfFour(64));
        assertFalse(test.isPowerOfFour(5));
        assertFalse(test.isPowerOfFour(1162261466));

        System.out.println(Integer.toBinaryString(0x55555555));
    }
}