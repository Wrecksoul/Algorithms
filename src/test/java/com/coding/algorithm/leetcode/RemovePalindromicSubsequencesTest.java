package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/7/15
 */
public class RemovePalindromicSubsequencesTest {

    @Test
    public void removePalindromeSub() {
        RemovePalindromicSubsequences test = new RemovePalindromicSubsequences();
        int i = test.removePalindromeSub("baabb");
        assertEquals(i, 2);
    }
}