package app24;

import java.util.ArrayList;

public class M8 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(120);
		list.add(10);
		list.add(12);
		list.add(20);
		System.out.println(list);
		list.set(2, 5000);
		System.out.println(list);
	}
}
