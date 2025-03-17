package app24;

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
		System.out.println(list);
		System.out.println(s1);
	}
}
