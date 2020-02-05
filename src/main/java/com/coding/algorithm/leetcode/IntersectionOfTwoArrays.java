package com.coding.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mengxiangzhe
 * @date 2020/2/5
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        set1.retainAll(set2);

        int[] r = new int[set1.size()];
        int i = 0;
        for (Integer next : set1) {
            r[i++] = next;
        }
        return r;
    }
}
