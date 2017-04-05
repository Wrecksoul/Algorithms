package com.coding.algorithm.sort;
import static com.coding.algorithm.sort.Utils.*;

/**
 * sort 升序方法
 * 选择排序，从第一（最后一个）个元素开始，每次选择最小（大）元素跟当前元素交换位置，一共需要找length-1个最大值
 * @author Walker
 */
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
	}
}
