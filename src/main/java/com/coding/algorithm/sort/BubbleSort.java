package com.coding.algorithm.sort;

import static com.coding.algorithm.sort.Utils.swap;

public class BubbleSort {
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int end = len; end > 0; end--) {
            for (int i = 1; i < end; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            }
        }
    }

    /**
     * 优化1:针对尾部有序
     *
     * 冒泡排序的排序方法非常独特,看似每次循环会获取一个最大值,类似选择排序
     * 但是其实每次都比较了两个靠近的元素.比选择排序的效率低,但是通过这种
     *
     * @param arr
     */
    public static void sortOptimized(int[] arr) {
        int len = arr.length;
        for (int end = len; end > 0; end--) {
            boolean isOrdered = true;
            for (int i = 1; i < end; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    isOrdered = false;
                }
            }
            if (isOrdered) {
                break;
            }
        }
    }

    /**
     *
     * @param arr
     */
    public static void sortOptimizedOptimized(int[] arr) {
        for (int end = arr.length - 1; end > 0; end--) {
            int sortedIndex = 1;
            for (int i = 1; i <= end; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    sortedIndex = i;
                }
            }
            end = sortedIndex;
        }
    }
}
