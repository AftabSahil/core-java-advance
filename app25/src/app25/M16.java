package app25;

import java.util.ArrayList;
import java.util.HashSet;

public class M16 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(1000);
		list.add(2000);
		list.add(2000);
		list.add(3000);
		list.add(3000);
		list.add(1000);
		System.out.println(list);
		list = new ArrayList<>(new HashSet<Integer>(list));
		System.out.println(list);
	}
}
