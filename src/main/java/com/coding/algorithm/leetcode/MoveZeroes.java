package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2020/2/4
 */
public class MoveZeroes {
    /**
     *
     * 难点在于需要保持有序
     * NOTE
     * 1You must do this in-place without making a copy of the array.
     * 2Minimize the total number of operations.
     *
     * 个人思路:找到第i非零数字,并且直接放置到第i个位置上
     * key:因为要move的是0,不需要进行两数字"交换",两部赋值即可
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int noZeroCount = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0 && noZeroCount != i) {
                noZeroCount ++;
                nums[i] = 0;
                nums[noZeroCount] = num;
            }
        }
    }
}
