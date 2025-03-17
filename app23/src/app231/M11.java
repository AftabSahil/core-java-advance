package app231;

import java.util.LinkedList;

public class M11 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.print(list.peekLast());
		System.out.print(list.peekLast());
		System.out.print(list.pollLast());
		System.out.print(list.peekLast());
		System.out.print(list.pollFirst());
		System.out.print(list.peekLast());
		System.out.print(list.peekFirst());
	}
}
