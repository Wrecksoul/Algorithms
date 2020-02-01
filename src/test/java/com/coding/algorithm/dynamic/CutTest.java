package com.coding.algorithm.dynamic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mengxiangzhe
 * @date 2020/1/13
 */
public class CutTest {
    private int[] arr;

    @Before
    public void setUp() throws Exception {
        arr = new int[]{1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
    }

    @Test
    public void cut() {
        assertEquals(Cut.cut(arr, 4), 10);
        assertEquals(Cut.cut(arr, 1), 1);
    }

    @Test
    public void cutMemo() {
        assertEquals(Cut.cutMemo(arr, 4), 10);
    }

    @Test
    public void buttom_up_cut() {
        assertEquals(Cut.buttom_up_cut(arr, 4), 10);
    }
}