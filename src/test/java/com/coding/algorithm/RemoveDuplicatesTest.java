package com.coding.algorithm;

import com.coding.algorithm.sort.Utils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author mengxiangzhe
 * @date 2019/12/12
 */
public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicates() {
        int[] nums1 = {1, 2, 2, 3};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int r1 = removeDuplicates.removeDuplicates(nums1);
        assertTrue(r1 == 3);
        assertArrayEquals(nums1, new int[]{1, 2, 3, 3});

        int[] nums2 = {1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 7, 8, 9, 9};
        int r2 = removeDuplicates.removeDuplicates(nums2);
        assertTrue(r2 == 9);
        Utils.printArray(nums2);
        //assertArrayEquals(nums1, new int[]{1, 2, 3, 3});
    }
}