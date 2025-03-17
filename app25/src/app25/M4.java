package app25;

import java.util.HashSet;

public class M4 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("abc");
		set.add("abc");
		set.add("xyz");
		set.add("abc");
		set.add("abc");
		set.add("xyz");
		set.add("abc");
		set.add(null);
		set.add(null);
		set.add(null);
		set.add("abc");
		set.add("null");
		set.add(null);
		set.add("null");
		System.out.println(set);
	}
}
