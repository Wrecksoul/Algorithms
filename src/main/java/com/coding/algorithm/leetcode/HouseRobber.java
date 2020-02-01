package com.coding.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mengxiangzhe
 * @date 2020/1/10
 */
public class HouseRobber {
    /**
     * 错误解 [2,1,1,2]=>4
     *
     * @param nums
     * @return
     */
    public int rob2(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum1 += nums[i];
        }
        for (int i = 1; i < nums.length; i += 2) {
            sum2 += nums[i];
        }
        return Math.max(sum1, sum2);
    }

    /**
     * 遇到的一个问题是如何用程序表达想法
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[0];
        }
        Map<Integer, Integer> memo = new HashMap<>();
        return rob(nums, nums.length, memo);
    }

    private int rob(int[] nums, int lastIndex, Map<Integer, Integer> memo) {
        if (memo.get(lastIndex) != null) {
            return memo.get(lastIndex);
        }
        if (lastIndex == 1) {
            memo.put(lastIndex, nums[0]);
            return nums[0];
        }
        if (lastIndex == 2) {
            memo.put(lastIndex, Math.max(nums[0], nums[1]));
            return Math.max(nums[0], nums[1]);
        }
        int r = Math.max(rob(nums, lastIndex - 1, memo), rob(nums, lastIndex - 2, memo) + nums[lastIndex - 1]);
        memo.put(lastIndex, r);
        return r;
    }

    /**
     * dp4 = (dp2 + num[3]) + dp3
     *
     * dp3 = (dp1 + num[2]) + dp2
     *
     * dp2 = max(num[0],num[1])
     *
     * dp1 = num[0]
     */
}
