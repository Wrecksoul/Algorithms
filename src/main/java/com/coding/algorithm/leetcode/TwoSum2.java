package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2020/1/3
 */
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i1 = 0;
        int i2 = 1;
        while (i1 < i2 && i2 < numbers.length) {
            int n1 = numbers[i1];
            while (i2 < numbers.length) {
                int n2 = numbers[i2];
                if (n2 + n1 == target) {
                    return new int[]{i1+1, i2+1};
                }
                i2++;
            }
            i1++;
            i2 = i1+1;
        }

        return null;
    }
}
