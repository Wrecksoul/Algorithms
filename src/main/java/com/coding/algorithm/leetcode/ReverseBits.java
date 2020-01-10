package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2020/1/10
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += n & 1;
            n >>= 1;
        }
        return result;
    }
}
