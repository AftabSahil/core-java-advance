package app31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class M2 {
	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("abc", 12);
//		map.put("xyz", 12);
//		map.put("test", 12);
//		map.put("java", 12);
//		System.out.println(map);
//		Iterator<String> it = map.keySet().iterator();
//		map.put("hello", 2000);
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}		
		Map<String, Integer> map1 = new ConcurrentHashMap<String, Integer>();
		map1.put("abc", 12);
		map1.put("xyz", 12);
		map1.put("test", 12);
		map1.put("java", 12);
		Iterator<String> it1 = map1.keySet().iterator();
		map1.put("hello", 2000);
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
