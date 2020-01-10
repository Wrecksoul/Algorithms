package com.coding.algorithm.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/1/10
 */
public class MajorityElementTest {

    @Test
    public void majorityElement() {
        MajorityElement test = new MajorityElement();
        assertEquals(test.majorityElement(new int[]{3}),3);
        assertEquals(test.majorityElement(new int[]{3, 2, 3}),3);
        assertEquals(test.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}), 2);
    }
}