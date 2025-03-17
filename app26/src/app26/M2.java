package app26;

import java.util.HashMap;

public class M2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 22);
		map.put("key", 122);
		map.put("age", 34);
		map.put("weight", 55);
		map.put("marks", 155);
		map.put("tests", 20);
		System.out.println(map.get("abc"));
		System.out.println(map.get("age"));
		System.out.println(map.get("weight"));
		System.out.println(map.get("java"));
	}
}
