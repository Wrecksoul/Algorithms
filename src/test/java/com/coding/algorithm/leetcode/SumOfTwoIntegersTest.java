package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mengxiangzhe
 * @date 2020/2/5
 */
public class SumOfTwoIntegersTest {

    @Test
    public void getSum() {
        SumOfTwoIntegers test = new SumOfTwoIntegers();
        assertEquals(5, test.getSum(2, 3));
        assertEquals(5, test.getSum2(5, 0));
        assertEquals(-7, test.getSubtract(-1, 6));
        assertEquals(-7, test.getSubtract2(-1, 6));
        assertEquals(-6, test.negate(6));
    }
}