package com.coding.algorithm.sort;

import static com.coding.algorithm.sort.Utils.printArray;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testSort() {
		int[] arr = {4,3,5,6,1,2,7};
		int[] expecteds = {1,2,3,4,5,6,7};
		QuickSort.sort(arr);
		printArray(arr);
		Assert.assertArrayEquals(expecteds, arr);
	}

}
