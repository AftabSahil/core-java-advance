package app31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class M3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(null, 12);
		map.put("xyz", null);
		System.out.println(map);
		Map<String, Integer> map1 = new ConcurrentHashMap<String, Integer>();
		map1.put(null, 12);
		map1.put("xyz", null);
		System.out.println(map1);
	}
}
