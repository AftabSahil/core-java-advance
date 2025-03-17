package app25;

import java.util.HashSet;
import java.util.Iterator;

public class M5 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("abc");
		set.add("hello");
		set.add("xyz");
		set.add("test");
		set.add("123");
		set.add("java");
		System.out.println(set);
		System.out.println("----------------");
		for(String obj : set) {
			System.out.print(obj + ", ");
		}
		System.out.println();
		System.out.println("---------------------");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		System.out.println("---------------------");
		
	}
}
