package app231;

import java.util.LinkedList;

public class M9 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10000);
		list.add(20000);
		list.add(50000);
		list.add(30000);
		list.add(90000);
		list.add(80000);
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
	}
}
