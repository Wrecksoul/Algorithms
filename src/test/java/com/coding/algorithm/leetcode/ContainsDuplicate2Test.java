package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author mengxiangzhe
 * @date 2020/2/2
 */
public class ContainsDuplicate2Test {

    @Test
    public void containsNearbyDuplicate() {
        ContainsDuplicate2 test = new ContainsDuplicate2();
        assertTrue(test.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertTrue(test.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        assertFalse(test.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    @Test
    public void containsNearbyDuplicate2() {
        ContainsDuplicate2 test = new ContainsDuplicate2();
        assertTrue(test.containsNearbyDuplicate2(new int[]{1, 2, 3, 1}, 3));
        assertTrue(test.containsNearbyDuplicate2(new int[]{1, 0, 1, 1}, 1));
        assertFalse(test.containsNearbyDuplicate2(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}