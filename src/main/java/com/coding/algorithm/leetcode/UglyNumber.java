package com.coding.algorithm.leetcode;

/**
 * key : 因数分解
 * <p>
 * NOTE
 * 1 is typically treated as an ugly number.<br/>
 * 2 Input is within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 *
 * @author mengxiangzhe
 * @date 2020/2/4
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 2 == 0) {
            num = num >>> 1;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }
}
