package com.coding.algorithm.sort;
import static com.coding.algorithm.sort.Utils.*;

public class SelectSort {
	public static void sort(int[] arr){
		int len = arr.length;
		int minIndex = 0;
		for (int i = 0; i < len-1; i++) {
			minIndex = i;
			for (int j = i; j < len; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if(i!= minIndex){
				swap(arr, i, minIndex);
			}
		}
		/*int maxIndex = 0;
		for (int i = 0; i < len - 1; i++) {
			maxIndex = len - 1 - i;
			for (int j = len - 1 - i; j >= 0; j--) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			swap(arr, maxIndex, len - i - 1);
		}*/
	}
}
