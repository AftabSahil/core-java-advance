package app26;

import java.util.HashMap;

public class M10 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println(map.putIfAbsent("abc", 22));
		System.out.println(map);
		System.out.println(map.putIfAbsent("abc", 122));
		System.out.println(map);
		System.out.println(map.getOrDefault("abc", 0));
		System.out.println(map.getOrDefault("xyz", 0));
		System.out.println(map.getOrDefault("xyz", 20));
		System.out.println(map.getOrDefault("abc", 20));
		System.out.println(map.getOrDefault("hello", 210));
	}
}
