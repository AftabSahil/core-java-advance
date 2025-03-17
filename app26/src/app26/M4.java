package app26;

import java.util.HashMap;

public class M4 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "abc");
		map.put(112, "xyz");
		String a = map.get(12);
		String b = map.get(112);
		String c = map.get(42);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
