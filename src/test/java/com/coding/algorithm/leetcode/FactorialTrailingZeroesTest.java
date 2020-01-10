package com.coding.algorithm.leetcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/1/9
 */
public class FactorialTrailingZeroesTest {

    @Test
    public void trailingZeroes() {
        FactorialTrailingZeroes test = new FactorialTrailingZeroes();
        assertEquals(test.trailingZeroes(3), 0);
        assertEquals(test.trailingZeroes(5), 1);
        assertEquals(test.trailingZeroes(10), 2);
        assertEquals(test.trailingZeroes(13), 2);
        assertEquals(test.trailingZeroes(30), 7);
    }

    @Test
    public void getCount() {
        FactorialTrailingZeroes test = new FactorialTrailingZeroes();
        HashMap<Integer, Integer> map = new HashMap<>();
        assertEquals(test.getPrimeNumber5Count(5, map), 1);
        assertEquals(test.getPrimeNumber5Count(10, map), 1);
        assertEquals(test.getPrimeNumber5Count(25, map), 2);
    }
}