package app28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

class B implements Comparable<B>{
	int i;
	B(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
	@Override
	public int compareTo(B o) {
		return i - o.i;
	}
}

public class M2 {
	public static void main(String[] args) {
		B b1 = new B(90);
		B b2 = new B(190);
		B b3 = new B(10);
		B b4 = new B(0);
		B b5 = new B(1);
		B b6 = new B(490);
//		ArrayList<B> list = new ArrayList<B>();
//		list.add(b1);
//		list.add(b2);
//		list.add(b3);
//		list.add(b4);
//		list.add(b5);
//		list.add(b6);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);

//		PriorityQueue<B> queue = new PriorityQueue<B>();
//		queue.add(b1);
//		queue.add(b2);
//		queue.add(b3);
//		queue.add(b4);
//		queue.add(b5);
//		queue.add(b6);
//		System.out.println(queue);
		

//		TreeSet<B> set = new TreeSet<B>();
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		set.add(b4);
//		set.add(b5);
//		set.add(b6);		
//		System.out.println(set);
		

		TreeMap<B, String> map = new TreeMap<B, String>();
		map.put(b1, "test");
		map.put(b2, "abc");
		map.put(b3, "hello");
		map.put(b4, "xyz");
		map.put(b5, "java");
		map.put(b6, "btm");
		System.out.println(map);
	
	}
}
















