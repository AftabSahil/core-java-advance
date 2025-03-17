package app26;

import java.util.HashMap;
import java.util.Set;

public class M15 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 423);
		map.put("hello", 128);
		map.put("test", 153);
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
