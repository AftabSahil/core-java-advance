package app24;

import java.util.ArrayList;

public class M9 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(120);
		list.add(10);
		list.add(12);
		list.add(20);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}
}
