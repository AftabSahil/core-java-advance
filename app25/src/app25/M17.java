package app25;

import java.util.ArrayList;
import java.util.HashSet;

public class M17 {
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
		HashSet<Integer> set = new HashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);
	}
}
