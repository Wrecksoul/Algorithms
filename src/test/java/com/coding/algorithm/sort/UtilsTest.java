package com.coding.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2019/12/30
 */
public class UtilsTest {

    @Test
    public void swap() {
        int[] ints = {5, 4, 3, 2, 1};
        Utils.swap(ints, 0, 1);
        assertArrayEquals(ints,new int[]{4, 5, 3, 2, 1});

        Utils.swap(ints, 1, 0);
        Utils.swap(ints, 4, 1);

        assertArrayEquals(ints,new int[]{5, 1, 3, 2, 4});
    }
}