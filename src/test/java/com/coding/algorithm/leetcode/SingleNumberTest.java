package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2019/12/25
 */
public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber test = new SingleNumber();
        int i = test.singleNumber(new int[]{2, 2, 1});
        assertTrue(i == 1);
        int i1 = test.singleNumber(new int[]{4, 1, 2, 1, 2});
        assertTrue(i1 == 4);
    }
}