package app25;

import java.util.TreeSet;

public class M12 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(1);
		set.add(110);
		set.add(20);
		set.add(5);
		set.add(15);
		set.add(75);
		set.add(108);
		System.out.println(set);
		System.out.println(set.headSet(40));
		System.out.println(set.tailSet(40));
		System.out.println("-------------");
		System.out.println(set.headSet(20));
		System.out.println(set.tailSet(20));
	}
}
