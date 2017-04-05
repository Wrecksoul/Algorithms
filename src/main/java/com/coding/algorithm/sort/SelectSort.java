package com.coding.algorithm.sort;
import static com.coding.algorithm.sort.Utils.*;

/**
 * sort ���򷽷�
 * ѡ�����򣬴ӵ�һ�����һ������Ԫ�ؿ�ʼ��ÿ��ѡ����С����Ԫ�ظ���ǰԪ�ؽ���λ�ã�һ����Ҫ��length-1�����ֵ
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
