package app23;

import java.util.ArrayList;

public class M11 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		list.add("btm");
		System.out.println(list);
		boolean s1 = list.remove("test");
		System.out.print(s1 ? 1 : 2);
		boolean s2 = list.remove("test");
		System.out.print(s2 ? 1 : 2);
		System.out.print(s1 || s2);
		System.out.print(s1 && s2);
		System.out.print(s1);
		System.out.print(s2);
	}

}
