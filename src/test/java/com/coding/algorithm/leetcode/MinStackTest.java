package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2019/12/25
 */
public class MinStackTest {

    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertTrue(minStack.getMin() == -3);
        assertTrue(minStack.top() == -3);

        minStack.pop();

        assertTrue(minStack.getMin() == -2);
        assertTrue(minStack.top() == 0);
    }
}