package app26;

import java.util.HashMap;

public class M6 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 122);
		map.put("abc", 222);
		map.put("abc", 322);
		System.out.println(map.get("abc"));
	}
}
