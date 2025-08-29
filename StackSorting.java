package com.inbuiltstack;

import java.util.Stack;

public class StackSorting {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(30);
		stack.push(10);
		stack.push(50);
		stack.push(20);
		
		sort(stack);
		System.out.println(stack);
	}

	// Recursive function to sort a stack
	public static void sort(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int top = stack.pop();
			sort(stack);
			insertSorted(stack, top);
		}
	}

	// Insert element in sorted order
	private static void insertSorted(Stack<Integer> stack, int value) {
		if (stack.isEmpty() || value > stack.peek()) {
			stack.push(value);
		} else {
			int top = stack.pop();
			insertSorted(stack, value);
			stack.push(top);
		}
	}
}
