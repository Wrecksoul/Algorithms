package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2019/12/25
 */
public class SingleNumber {
    /**
     * 利用异或性质,
     * 1 任何数与自身异或都是0
     * 2 任何数和0异或都是其本身
     *
     * @param nums arr
     * @return singleNumber
     */
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }
}
