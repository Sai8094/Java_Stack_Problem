package com.inbuiltstack;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {

		System.out.println(isBalanced("()"));

	}

	static boolean isBalanced(String string) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < string.length(); i++) {
			Character pushCharacter = string.charAt(i);
			if (pushCharacter == '(' || pushCharacter == '[' || pushCharacter == '{') {
				stack.push(pushCharacter);
			} else {
				if (stack.isEmpty())
					return false;
			}
			Character popCharacter = stack.peek();
			stack.pop();
			if (pushCharacter == '(' && popCharacter != ')' || pushCharacter == '[' && popCharacter != ']'
					|| pushCharacter == '{' && popCharacter != '}')
				return true;

		}
		return stack.isEmpty();
	}
}
