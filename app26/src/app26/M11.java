package app26;

import java.util.HashMap;

public class M11 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(null, null);
		map.put(null, 20);
		map.put(null, 40);
		map.put(null, 60);
		System.out.println(map);
	}
}
