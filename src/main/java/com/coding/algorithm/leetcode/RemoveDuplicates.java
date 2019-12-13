package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2019/12/12
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int preIndex = 0;
        int curIndex = 1;

        while (curIndex < nums.length) {

            if (nums[preIndex] == nums[curIndex]) {
                curIndex++;
            } else {
                preIndex++;
                nums[preIndex] = nums[curIndex];
                curIndex++;
            }
        }
        return preIndex+1;
    }
}
