package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2020/1/3
 */
public class TwoSum2 {
    /**
     * 暴力循环
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum2(int[] numbers, int target) {
        int i1 = 0;
        int i2 = 1;
        while (i1 < i2 && i2 < numbers.length) {
            int n1 = numbers[i1];
            while (i2 < numbers.length) {
                int n2 = numbers[i2];
                if (n2 + n1 == target) {
                    return new int[]{i1 + 1, i2 + 1};
                }
                i2++;
            }
            i1++;
            i2 = i1 + 1;
        }

        return null;
    }

    /**
     * 二分查找
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum3(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            int result = binarySearch(numbers, target - numbers[i], i + 1, numbers.length - 1);
            if (result > 0) {
                return new int[]{i + 1, result + 1};
            }
        }
        return null;
    }

    private int binarySearch(int[] numbers, int find, int beginIndex, int endIndex) {
        if (endIndex == beginIndex + 1) {
            if (numbers[endIndex] == find) {
                return endIndex;
            } else if (numbers[beginIndex] == find) {
                return beginIndex;
            } else {
                return -1;
            }
        }
        int number = numbers[(beginIndex + endIndex) / 2];
        if (number > find) {
            return binarySearch(numbers, find, beginIndex, (beginIndex + endIndex) / 2);
        } else if (number < find) {
            return binarySearch(numbers, find, (beginIndex + endIndex) / 2, endIndex);
        } else {
            return (beginIndex + endIndex) / 2;
        }
    }

    /**
     * 双指针
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;
        while (true) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}
