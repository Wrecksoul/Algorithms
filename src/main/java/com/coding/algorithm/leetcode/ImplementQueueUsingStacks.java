package com.coding.algorithm.leetcode;

import java.util.LinkedList;

/**
 * @author mengxiangzhe
 * @date 2020/2/3
 */
public class ImplementQueueUsingStacks {
    private LinkedList<Integer> inputStack = new LinkedList<>();
    private LinkedList<Integer> outputStack = new LinkedList<>();

    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (outputStack.isEmpty()) {
//            if (inputStack.isEmpty()) {
//                return 0;//todo 如何处理无元素
//            }
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
