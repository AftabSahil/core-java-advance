package app24;

import java.util.PriorityQueue;

public class M2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(20);
		queue.add(120);
		queue.add(210);
		queue.add(201);
		queue.add(220);
		queue.add(620);
		queue.add(320);
		queue.add(150);
		queue.add(50);
		queue.add(50);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
