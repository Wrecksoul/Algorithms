package com.coding.algorithm.leetcode;

import java.util.LinkedList;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {

    private LinkedList<Integer> data = new LinkedList<>();
    private LinkedList<Integer> minData = new LinkedList<>();

    /**
     * initialize your data structure here.
     */
    public MinStack() {
    }

    public void push(int x) {
        data.push(x);
        Integer peek = minData.peek();
        if (peek != null && peek < x) {
            minData.push(peek);
        } else {
            minData.push(x);
        }
    }

    public void pop() {
        minData.pop();
        data.pop();
    }

    public int top() {
        Integer peek = data.peek();
        if (peek != null) {
            return peek;
        }
        return 0;
    }

    public int getMin() {
        Integer peek = minData.peek();
        if (peek != null) {
            return peek;
        }
        return 0;
    }
}
