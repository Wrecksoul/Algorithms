package com.coding.algorithm.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		int[] arr = {5,4,2,1,3};
		int[] expecteds = {1,2,3,4,5};
		BubbleSort.sort(arr);
		Assert.assertArrayEquals(expecteds, arr);
	}

}
