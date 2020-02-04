package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/2/3
 */
public class ImplementQueueUsingStacksTest {

    @Test
    public void test() {
        ImplementQueueUsingStacks test = new ImplementQueueUsingStacks();
        assertTrue(test.empty());
        test.push(1);
        test.push(2);
        int pop = test.pop();
        assertEquals(1, pop);
        assertEquals(2, test.peek());
        assertFalse(test.empty());
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);
        assertFalse(test.empty());
        assertEquals(2, test.peek());
        assertEquals(2, test.pop());
        assertEquals(3, test.pop());
        assertEquals(4, test.pop());
        assertEquals(5, test.pop());
        assertEquals(6, test.pop());
        assertTrue(test.empty());
    }
}