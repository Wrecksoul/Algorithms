package com.coding.algorithm.sort;

import static com.coding.algorithm.sort.Utils.printArray;

import org.junit.Assert;
import org.junit.Test;

public class SelectSortTest {

	@Test
	public void testSort() {
		int[] arr = {5,4,3,1,2};
		int[] expecteds = {1,2,3,4,5};
		SelectSort.sort(arr);
		printArray(arr);
		Assert.assertArrayEquals(expecteds, arr);
	}

}
