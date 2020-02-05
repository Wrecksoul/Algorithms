package com.coding.algorithm.leetcode;

/**
 * @author mengxiangzhe
 * @date 2020/2/4
 */
public class PowerOfFour {

    /**
     * 一种不使用使用循环也不使用递归的判断方式
     * (num & (num -1)) == 0 证明是2的n次幂
     * 0x55555555 --> 1010101010101010101010101010101 共31位,首位为符号位0,从低到高,基数位为1的特征数字
     * 此特征数字和4n次幂 1/100/10000 得到其本身
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0b1010101010101010101010101010101) == num);
    }

    /**
     * recursion
     *
     *
     * @param num
     * @return
     */
    public boolean isPowerOfFour2(int num) {
        if (num <= 0) {
            return false;
        }
        if (num % 4 != 0) {
            return num == 1;
        }
        num = num >> 2;
        return isPowerOfFour2(num);
    }

    /**
     * loop
     *
     *
     * @param num
     * @return
     */
    public boolean isPowerOfFour3(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 4 == 0) {
            num = num >> 2;
        }
        return num == 1;
    }

    /**
     * 疑问为什么这种方式在输入1162261466时开始超时呢?这种方式和前两种有什么本质区别吗?
     *
     * 答:通过debug发现,这种方式会由于越界而导致归零,归零后<<2永远都是0,死循环
     *
     * @param num
     * @return
     */
    public boolean isPowerOfFour_FALSE_ANSWER(int num) {
        if (num < 4) {
            return false;
        }
        int p4 = 1;
        while (p4 < num) {
            p4 = p4 << 2;
        }
        return p4 == num;
    }
}
