package app23;

import java.util.ArrayList;

public class M3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(90.56);
		list.add("abc");
		list.add(true);
		//System.out.println(list);		
		System.out.println(list.get(2));
		String s1 = (String)  list.get(2);
		System.out.println(s1);
		
	}
}
