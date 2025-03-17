package app23;

import java.util.ArrayList;
import java.util.Collections;

public class M26 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(20);
		list.add(220);
		list.add(22);
		list.add(42);
		list.add(23);
		list.add(22);
		System.out.println(list);
		System.out.println(list.contains(20));
		System.out.println(list.contains(42));
		System.out.println(list.contains(11));
	}
}
