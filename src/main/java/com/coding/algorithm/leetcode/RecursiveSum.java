package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2019/12/13
 */
public class RecursiveSum {
    public int sum(int[] nums) {
        return sum(nums, 0);
    }

    private int sum(int[] nums, int index) {
        if (index < nums.length) {
            return nums[index++] + sum(nums, index);
        }
        return 0;
    }
}
