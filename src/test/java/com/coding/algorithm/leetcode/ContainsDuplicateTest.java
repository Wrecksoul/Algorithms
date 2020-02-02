package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/2/2
 */
public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        ContainsDuplicate test = new ContainsDuplicate();
        assertTrue(test.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(test.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertTrue(test.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}