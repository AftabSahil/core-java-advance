package app26;

import java.util.Hashtable;

public class M18 {
	public static void main(String[] args) {
		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
		table.put("abc", 1000);
		table.put("abc", 2000);
		table.put("abc2", 3000);
		table.put("abc3", null);
		table.put("abc4", 5000);
		table.put("abc5", 6000);
		System.out.println(table);
	}
}
