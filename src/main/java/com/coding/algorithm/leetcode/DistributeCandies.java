package com.coding.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mengxiangzhe
 * @date 2020/7/14
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        int max = candies.length / 2;
        int typeNum = set.size();
        if (typeNum >= max) {
            return max;
        }else {
            return typeNum;
        }
    }
}
