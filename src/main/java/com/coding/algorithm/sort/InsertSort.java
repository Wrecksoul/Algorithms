package com.coding.algorithm.sort;

/**
 * 插入排序,原地算法
 * https://zh.wikipedia.org/wiki/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F
 * 连接里面有动图
 */
public class InsertSort {
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int j = i + 1;// j is index
            int insert = arr[i + 1];

            /*
             * 移动并插入到指定位置
             */
            while (j > 0 && insert < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = insert;
        }
    }
}
