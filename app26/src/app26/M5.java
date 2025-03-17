package app26;

import java.util.HashMap;

public class M5 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 22);
		map.put("xyz", 22);
		map.put("hello", 22);
		System.out.println(map.get("abc"));
		System.out.println(map.get("xyz"));
		System.out.println(map.get("hello"));
	}

}
