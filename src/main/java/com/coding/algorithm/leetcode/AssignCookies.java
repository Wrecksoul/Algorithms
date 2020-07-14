package com.coding.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author mengxiangzhe
 * @date 2020/7/14
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int childIndex = 0;
        int cookieIndex = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while (childIndex < g.length && cookieIndex < s.length) {
            int childVal = g[childIndex];
            int cookieVal = s[cookieIndex];
            if (childVal <= cookieVal) {
                count++;
                cookieIndex++;
                childIndex++;
            } else {
                cookieIndex++;
            }
        }

        return count;
    }
}
