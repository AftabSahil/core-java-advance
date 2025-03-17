package app26;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class M12 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz", 423);
		map.put("hello", 128);
		map.put("test", 153);
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry);
		}
	}

}
