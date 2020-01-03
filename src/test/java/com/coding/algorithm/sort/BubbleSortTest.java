package com.coding.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import static com.coding.algorithm.sort.Utils.printArray;

public class BubbleSortTest {

    @Test
    public void sort() {
        int[] arr = {5, 4, 2, 1, 3, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        BubbleSort.sort(arr);
        printArray(arr);
        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    public void sortOptimized() {
        int[] arr = {5, 4, 2, 1, 3, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        BubbleSort.sortOptimized(arr);
        printArray(arr);
        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    public void sortOptimizedOptimized() {
        int[] arr = {5, 4, 2, 1, 3, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        BubbleSort.sortOptimizedOptimized(arr);
        printArray(arr);
        Assert.assertArrayEquals(expected, arr);
    }
}
