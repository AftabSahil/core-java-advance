package app26;

import java.util.HashMap;

public class M7 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println(map.put("abc", 122));
		System.out.println(map);
		System.out.println(map.put("abc", 322));
		System.out.println(map);
	}
}
