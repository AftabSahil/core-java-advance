package app26;

import java.util.LinkedHashMap;

public class M25 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("abc", 1);
		map.put("xyz", 11);
		map.put("test", 21);
		map.put("java", 12);
		map.put("spring", 31);
		map.put("js", 13);
		map.put("hello", 41);
		map.put("token", 14);
		System.out.println(map);
	}
}
