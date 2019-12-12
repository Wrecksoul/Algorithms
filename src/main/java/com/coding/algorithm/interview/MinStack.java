package com.coding.algorithm.interview;

import java.util.Comparator;
import java.util.Stack;

import com.coding.algorithm.sort.Utils;

/**
 * 最小栈，可以O(1)获取最小值的栈
 *
 * @param <T>
 */
public class MinStack<T> {
	private Stack<T> stackData = new Stack<T>();
	private Stack<T> stackMin = new Stack<T>();

	private Comparator<T> cpt;

	public MinStack() {
		cpt = null;
	}

	public MinStack(Comparator<T> cpt) {
		this.cpt = cpt;
	}

	@SuppressWarnings("unchecked")
	public void push(T obj) {
		stackData.push(obj);
		if (cpt != null) {
			if (stackMin.isEmpty() || cpt.compare(stackMin.peek(), obj) > 0) {
				stackMin.push(obj);
			}else{
				stackMin.push(stackMin.peek());
			}
		} else {
			if (stackMin.isEmpty()
					|| ((Comparable<T>) stackMin.peek()).compareTo(obj) > 0) {
				stackMin.push(obj);
			} else {
				stackMin.push(stackMin.peek());
			}
		}
	}

	public T pop() {
		stackMin.pop();
		return stackData.pop();
	}

	public T getMin() {
		return stackMin.peek();
	}

	@Override
	public String toString() {
		return "data:" + stackData.toString() + "\n" + "min:"
				+ stackMin.toString();
	}

	public static void main(String[] args) {
		MinStack<Integer> stack = new MinStack<Integer>();
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(4);
		stack.push(7);
		stack.push(0);
		System.out.println(stack);
	}

}
