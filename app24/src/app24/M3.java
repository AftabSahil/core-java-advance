package app24;

import java.util.PriorityQueue;

public class M3 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("xyz");
		queue.add("abc");
		queue.add("hello");
		queue.add("java");
		queue.add("test");
		queue.add("spring");
		queue.add("collections");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
