package app25;

import java.util.HashSet;

public class M1 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(100);
		set.add(200);
		set.add(200);
		set.add(200);
		set.add(400);
		set.add(400);
		set.add(400);
		System.out.println(set);
	}
}
