package com.coding.algorithm.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author mengxiangzhe
 * @date 2020/2/2
 */
public class ContainsDuplicate2 {
    /**
     * 思路来自leetcode讨论区
     * 一个k长度的窗口,其实这个题是判断
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            boolean add = set.add(num);
            if (!add) {
                return true;
            }
        }
        return false;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num) && i - map.get(num) <= k) {
                return true;
            }
            map.put(num, i);
        }
        return false;
    }
}
