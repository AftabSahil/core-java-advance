package app9;

import java.util.ArrayList;

public class M8 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.equals(s2));
		Integer i1 = Integer.valueOf(100);
		Integer i2 = Integer.valueOf(100);
		System.out.println(i1.equals(i2));
		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(200);
		ArrayList list2 = new ArrayList();
		list2.add(100);
		list2.add(200);
		System.out.println(list1.equals(list2));
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb1.equals(sb2));
	}
}






