package app26;

import java.util.TreeMap;

public class M23 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "xyz");
		map.put(10, "abc");
		map.put(1, "test");
		map.put(200, "hello");
		map.put(150, "java");
		map.put(125, "pqr");
		map.put(45, "ijk");
		map.put(35, "spring");
		map.put(65, "react");
		System.out.println(map);
		System.out.println(map.floorEntry(45));
		System.out.println(map.floorEntry(200));
		System.out.println(map.ceilingEntry(45));
		System.out.println(map.ceilingEntry(200));
	}
}
