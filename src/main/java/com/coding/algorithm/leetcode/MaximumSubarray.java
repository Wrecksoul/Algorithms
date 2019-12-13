package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2019/12/12
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {

            sum = Math.max(sum + num, num);

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public int maxSubArrayV2(int[] nums) {
        return 0;
    }
}
