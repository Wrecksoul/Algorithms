package com.coding.algorithm.sort;
import static com.coding.algorithm.sort.Utils.*;

public class SelectSort {
	public static void sort(int[] arr){
		int len = arr.length;
		int max = 0;
		for (int i = 0; i < len; i++) {
			max = arr[i];
			int lastIndex = len - i - 1;
			for (int j = 1; j <= lastIndex; j++) {
				if(arr[j] > max) {
					max = arr[j];
					swap(arr, lastIndex, i);
				}
			}
		}
	}
}
