package com.coding.algorithm.sort;
import static com.coding.algorithm.sort.Utils.*;

public class BubbleSort {
	public static void sort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			for (int j = 1; j <= len - i - 1; j++) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j-1);
				}
			}
		}
	}
}
