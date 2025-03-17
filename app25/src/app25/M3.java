package app25;

import java.util.HashSet;

public class M3 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.print(set.add(1) == set.add(null));
		System.out.print(set.add(null) == set.add(2));
		System.out.print(set.add(3) == set.add(4));
		System.out.print(set.add(1) == set.add(5));
		System.out.print(set.contains(1) == set.add(6));
		System.out.print(set.contains(2) == set.add(7));
		System.out.print(set.contains(3) == set.add(8));
		System.out.print(set.contains(4) == set.add(9));
		System.out.print(set.contains(5) == set.add(10));
		System.out.print(set.contains(null) == set.add(11));
		System.out.print(set.size());
	}
}
