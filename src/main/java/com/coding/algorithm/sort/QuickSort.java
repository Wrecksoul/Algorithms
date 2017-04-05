package com.coding.algorithm.sort;

/**
 * 快速排序是不稳定的，其时间复杂度是O(nlgn)
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
	 * 一次分治
	 * @param left 首节点下标
	 * @param right 末节点下标
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
