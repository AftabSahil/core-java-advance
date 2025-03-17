package app27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class B{
	int i;
	B(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "( i = " + i + " )";
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(10);
		B b2 = new B(110);
		B b3 = new B(210);		
		ArrayList<B> list = new ArrayList<B>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		System.out.println(list);
//	
//		HashSet<B> set = new HashSet<B>();
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		System.out.println(set);
//		
//		HashMap<String, B> map1 = new HashMap<String, B>();
//		map1.put("abc", b1);
//		map1.put("xyz", b2);
//		map1.put("test", b3);
//		System.out.println(map1);
//		
//		HashMap<B, Integer> map2 = new HashMap<B, Integer>();
//		map2.put(b1, 300);
//		map2.put(b2, 400);
//		map2.put(b3, 500);
//		System.out.println(map2);
	}
}







