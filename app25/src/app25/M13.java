package app25;

import java.util.TreeSet;

public class M13 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.print(set.headSet(20, set.add(40)));
		System.out.print(set.tailSet(30, set.add(40)));
		System.out.print(set.size());
	}
}
