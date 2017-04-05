package com.coding.algorithm.sort;

public class InsertSort {
	public static void sort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			int j = i + 1;// j is index
			int insert = arr[i + 1];
			arr[j] = insert;
			while (j > 0 && insert < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = insert;
		}
	}
}
