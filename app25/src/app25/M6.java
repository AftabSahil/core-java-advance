package app25;

import java.util.HashSet;
import java.util.TreeSet;

public class M6 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("abc");
		set.add("hello");
		set.add("xyz");
		set.add("test");
		set.add("123");
		set.add("java");
		System.out.println(set);
		TreeSet<String> set1 = new TreeSet<String>(set);
		System.out.println(set1);
	}
}

