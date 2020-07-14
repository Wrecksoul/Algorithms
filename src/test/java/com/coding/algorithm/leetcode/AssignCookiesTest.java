package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mengxiangzhe
 * @date 2020/7/14
 */
public class AssignCookiesTest {

    @Test
    public void findContentChildren() {
        AssignCookies test = new AssignCookies();
        int t1 = test.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1});
        assertEquals(1, t1);
        int t2 = test.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3});
        assertEquals(2, t2);
        int t3 = test.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8});
        assertEquals(2, t3);
    }
}