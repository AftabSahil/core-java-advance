package app231;

import java.util.Stack;

public class M5 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1000);
		stack.push(2000);
		stack.push(3000);
		stack.push(4000);
		stack.push(5000);
		System.out.print(stack.search(1000)
						+ stack.search(5000) 
						+ stack.search(2000) 
						+ stack.search(4000) 
						+ stack.search(45000));
	}
}
