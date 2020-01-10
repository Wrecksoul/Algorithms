package com.coding.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mengxiangzhe
 * @date 2020/1/10
 */
public class MajorityElement {
    /**
     * 暴力解法挨个计数,找最大
     *
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, (a, b) -> a + 1);
        }
        int majorityElement = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            Integer count = integerIntegerEntry.getValue();
            if (count > max) {
                max = count;
                majorityElement = integerIntegerEntry.getKey();
            }
        }
        return majorityElement;
    }

    /**
     * 超过n/2个数的元素只可能存在一个,而且题目说必然有一个,所以是有且只有一个
     *
     * @param nums
     * @return
     */
    public int majorityElement3(int[] nums) {
        int limit = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                if (count + 1 > limit) {
                    return num;
                }
                map.put(num, count + 1);
            }
        }

        return nums[0];
    }

    /**
     * 特征
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
