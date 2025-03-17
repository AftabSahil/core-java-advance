package app26;

import java.util.HashMap;
import java.util.TreeMap;

public class M19 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("test", 1000);
		map.put("abc", 2000);
		map.put("xyz", 4000);
		map.put("java", 7000);
		map.put("btm", 9000);
		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>(map);
		System.out.println(map1);
	}
}
