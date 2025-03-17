package app27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class A {
	int i;
	A(int i){
		this.i = i;
	}
}
public class M1 {
	public static void main(String[] args) {
//		ArrayList<A> list = new ArrayList<A>();
//		list.add(new A(90));
//		list.add(new A(90));
//		list.add(new A(90));
//		System.out.println(list);

		A a1 = new A(90);
		A a2 = new A(190);
		A a3 = new A(910);
		
//		HashSet<A> set = new HashSet<A>();
//		set.add(a1);
//		set.add(a2);
//		set.add(a3);
//		System.out.println(set);
	
//		HashMap<A, Integer> map = new HashMap<A, Integer>();
//		map.put(a1, 1000);
//		map.put(a2, 2000);
//		map.put(a3, 3000);
//		System.out.println(map);
		
		HashMap<Integer, A> map1 = new HashMap<Integer, A>();
		map1.put(100, a3);
		map1.put(200, a1);
		map1.put(300, a2);
		
		System.out.println(map1);
	
	
	
	}
}
