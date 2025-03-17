package app24;

import java.util.LinkedList;

public class M1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		list.add(6000);
		System.out.println(list);
		while(!list.isEmpty()) {
			System.out.println(list.pop());
		}
		
	}
}
