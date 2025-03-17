package app25;

import java.util.HashSet;

public class M2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.print(set.add(1) ? set.add(1) : set.add(2));
		System.out.print(set.add(2) ? set.add(2) : set.add(3));
		System.out.print(set.add(4) ? set.add(5) : set.add(6));
		System.out.print(set.contains(1));
		System.out.print(set.contains(2));
		System.out.print(set.contains(3));
		System.out.print(set.contains(4));
		System.out.print(set.contains(5));
		System.out.print(set.contains(6));
	}
}
