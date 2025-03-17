package app23;

import java.util.ArrayList;

public class M18 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		list.add("btm");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("xyz");
		list2.add("btm");
		list2.add("test");
		list2.add("mobile");
		System.out.println(list);
		System.out.println(list2);
		System.out.println("-----------------------");
		list.retainAll(list2);		
		System.out.println(list);
		System.out.println(list2);
	}
}
