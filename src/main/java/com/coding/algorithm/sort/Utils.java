package com.coding.algorithm.sort;

public class Utils {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void printArray(int[] arr){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int anArr : arr) {
			sb.append(anArr).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		System.out.println(sb.toString());
	}
}
