package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author mengxiangzhe
 * @date 2019/12/23
 */
public class ValidPalindromeTest {

    @Test
    public void isPalindrome() {
        ValidPalindrome test = new ValidPalindrome();
        assertTrue(test.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(test.isPalindrome("race a car"));
    }
}