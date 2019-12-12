package com.coding.algorithm.sort;

import static com.coding.algorithm.sort.Utils.printArray;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void sort() {
		int[] arr = {5,4,2,1,3};
		int[] expecteds = {1,2,3,4,5};
		BubbleSort.sort(arr);
		printArray(arr);
		Assert.assertArrayEquals(expecteds, arr);
	}

}
