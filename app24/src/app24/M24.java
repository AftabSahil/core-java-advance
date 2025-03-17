package app24;

import java.util.ArrayList;
import java.util.Collections;

public class M24 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9000);
		list.add(2000);
		list.add(21000);
		list.add(12000);
		list.add(3000);
		list.add(23000);
		list.add(22000);
		list.add(22000);
		list.add(22);
		list.add(220);
		list.add(22000);
		list.add(220);
		list.add(22);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		int index = Collections.binarySearch(list, 220);
		System.out.println(index);
	}
}
