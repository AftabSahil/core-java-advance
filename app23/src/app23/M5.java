package app23;

import java.util.ArrayList;

public class M5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(120);
		list.add(10);
		list.add(12);
		list.add(20);
//		list.add(1.45);
		System.out.println(list);
		int i = list.get(2);
		System.out.println(i);
	}
}
