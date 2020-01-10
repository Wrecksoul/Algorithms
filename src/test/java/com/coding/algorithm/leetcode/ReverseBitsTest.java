package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/1/10
 */
public class ReverseBitsTest {

    @Test
    public void reverseBits() {
        ReverseBits test = new ReverseBits();
        assertEquals(test.reverseBits(Integer.MAX_VALUE),-2);
        assertEquals(test.reverseBits(43261596),964176192);
//        assertEquals(test.reverseBits(4294967293),3221225471);
    }
}