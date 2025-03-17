package app25;

import java.util.TreeSet;

public class M11 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(1);
		set.add(110);
		set.add(20);
		System.out.println(set);
		System.out.println(set.floor(20));
		System.out.println(set.ceiling(20));
		System.out.println("-------------");
		System.out.println(set.floor(22));
		System.out.println(set.ceiling(22));
	}

}
