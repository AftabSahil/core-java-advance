package app26;

import java.util.HashMap;

public class M3 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 22);
		map.put("key", 122);
		map.put("age", 34);
		map.put("weight", 55);
		map.put("marks", 155);
		map.put("tests", 20);
		Integer a = map.get("age"); 
		Integer b = map.get("tests"); 
		Integer c = map.get("btm"); 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
