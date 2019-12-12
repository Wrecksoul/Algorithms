package com.coding.algorithm.sort;

/**
 *
 * 
 * @author Walker
 */
public class QuickSort {
	public static void sort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		sort(arr, 0, arr.length - 1);
	}

	public static void sort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivotPos = partition(left, right, arr);
		sort(arr, left, pivotPos - 1);
		sort(arr, pivotPos + 1, right);
	}

	/**
	 *
	 * @param left
	 * @param right
	 * @param arr
	 * @return
	 */
	private static int partition(int left, int right, int[] arr) {
		int pivotValue = arr[left];

		while (left < right) {
			while (left < right && arr[right] >= pivotValue) {
				right--;
			}
			arr[left] = arr[right];
			while (left < right && arr[left] <= pivotValue) {
				left++;
			}
			arr[right] = arr[left];
		}
		arr[left] = pivotValue;
		return left;
	}
}
