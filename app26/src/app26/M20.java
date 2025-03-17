package app26;

import java.util.HashMap;
import java.util.TreeMap;

public class M20 {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("test", 1000);
		map.put("abc", 2000);
		map.put("xyz", 4000);
		map.put("java", 7000);
		map.put("btm", 9000);
		System.out.println(map);
	}
}
