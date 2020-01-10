package com.coding.algorithm.leetcode;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mengxiangzhe
 * @date 2020/1/9
 */
public class FactorialTrailingZeroes {
    /**
     * 字符串转换,查找法
     * 此方法不可行,即使使用BigDecimal可以解决溢出的问题,但是会超时
     *
     * @param n
     * @return
     */
    public int trailingZeroes2(int n) {
        BigDecimal res = BigDecimal.ONE;
        while (n > 1) {
            res = res.multiply(BigDecimal.valueOf(n));
            n--;
        }
        String s = res.toPlainString();
        int index = s.length() - 1;
        int count = 0;
        while (index > 0 && s.charAt(index--) == '0') {
            count++;
        }
        return count;
    }

    /**
     * 发现规律,因为乘以一个数只有乘以5的倍数的时候才会出现0<br/>
     * <p>
     * 这个规律发现是错误的,是5的倍数,但是应该是拆解到质因数后有多少个5<br/>
     * 下面的解发现了10需要+2,其实15 20 25 分别需要+3 +4 +5
     *
     * 错误的解
     *
     * @param n
     * @return
     */
    public int trailingZeroes3(int n) {
        int count = 0;
        while (n > 1) {
            if (n % 10 == 0) {
                count++;
            }
            if (n-- % 5 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * 找每个数字有多个质因数5,优化版,依旧超时
     * 复杂度高,不符合题意
     *
     * @param n
     * @return
     */
    public int trailingZeroes4(int n) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>(1000);
        int i = 5;
        while (i < n + 1) {
            count += getPrimeNumber5Count(i, map);
            map.put(i, count);
            i++;
        }
        return count;
    }

    public int getPrimeNumber5Count(int number, Map<Integer, Integer> map) {
        if (number % 5 != 0) {
            return 0;
        }
        Integer count = map.get(number);
        if (count != null) {
            return count;
        }
        return getPrimeNumber5Count(number / 5, map) + 1;//有个5,所以+1
    }

    /**
     * 题目要求lgn的时间复杂度,而不是n*lgn的复杂度,肯定没有循环.
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
