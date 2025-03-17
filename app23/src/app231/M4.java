package app231;

import java.util.Stack;

public class M4 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1000);
		stack.push(2000);
		stack.push(3000);
		stack.push(4000);
		stack.push(5000);
		while(!stack.empty()) {
			System.out.print(stack.pop() + ", ");
		}
		System.out.print(stack);
	}
}
