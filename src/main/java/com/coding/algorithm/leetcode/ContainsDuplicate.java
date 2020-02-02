package com.coding.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author mengxiangzhe
 * @date 2020/2/2
 */
public class ContainsDuplicate {
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 使用set的最简单的方式是比较size
     * @param nums
     * @return
     */
    public boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }

    /**
     * 先排序,Arrays.sort(nums)是堆排序 最坏是O(nlogn)
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            int next = nums[i + 1];
            if (next == num) {
                return true;
            }
        }
        return false;
    }
}
