package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author mengxiangzhe
 * @date 2020/2/4
 */
public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        MoveZeroes test = new MoveZeroes();
        int[] input1 = {0, 1, 0, 3, 12};
        test.moveZeroes(input1);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, input1);
        int[] input2 = {0, 1, 2, 3, 12};
        test.moveZeroes(input2);
        assertArrayEquals(new int[]{1, 2, 3, 12, 0}, input2);
        int[] input3 = {0, 1, 0, 3, 2};
        test.moveZeroes(input3);
        assertArrayEquals(new int[]{1, 3, 2, 0, 0}, input3);
        int[] input4 = {0, 0, 1, 0, 2, 3, 4, 0, 0, 5};
        test.moveZeroes(input4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0}, input4);

        int[] input5 = {1, 0};
        test.moveZeroes(input5);
        assertArrayEquals(new int[]{1, 0}, input5);
    }
}