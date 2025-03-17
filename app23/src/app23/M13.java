package app23;

import java.util.ArrayList;

public class M13<E> extends ArrayList<E>{
	public static void main(String[] args) {
		M13<String> list = new M13<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		list.add("btm");
		System.out.println(list);
		list.removeRange(2, 5);
		System.out.println(list);
	}
}
