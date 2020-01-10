package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2020/1/10
 */
public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight2(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }
}
