package app23;

import java.util.ArrayList;

public class M16 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		list.add("btm");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("spring");
		list2.add("react");
		list2.add("mobile");
		list2.addAll(1, list);
		
		System.out.println(list);
		System.out.println(list2);
	}
}
