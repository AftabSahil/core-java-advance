package app24;

import java.util.ArrayList;

public class M6 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(120);
		list.add(10);
		list.add(12);
		list.add(20);
		System.out.println(list);
		System.out.println("---------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------");
		for(int i : list) {
			System.out.println(i);
		}
	}
}
