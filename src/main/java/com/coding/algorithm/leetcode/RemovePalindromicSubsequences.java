package com.coding.algorithm.leetcode;

/**
 *
 *
 * Any string can be divided in 2 palindromic subsequences (where we can combine all 'a's in one subsequence and all 'b's in the other).
 * Special cases are quite clear and handled early.
 *
 * 这题太扯淡了,subsequences 可以不连续的.
 *
 * @author mengxiangzhe
 * @date 2020/7/15
 */
public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        if (s.length() == 0)
            return 0;
        if (isPalindrome(s)) {
            return 1;
        } else {
            return 2;
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!(s.charAt(left++) == s.charAt(right--))) {
                return false;
            }
        }
        return true;
    }
}
