package com.coding.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/7/15
 */
public class Shift2DGridTest {

    @Test
    public void shiftGrid() {
        int[][]arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};


        Shift2DGrid test = new Shift2DGrid();
        List<List<Integer>> res1 = test.shiftGrid(arr1, 1);

        List<Integer> l1 = Arrays.asList(9, 1, 2);
        List<Integer> l2 = Arrays.asList(3, 4, 5);
        List<Integer> l3 = Arrays.asList(6, 7, 8);

        List<List<Integer>> expectedList = Arrays.asList(l1, l2, l3);

        assertTrue(expectedList.equals(res1));
    }
}