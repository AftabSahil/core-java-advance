package app23;

import java.util.ArrayList;
import java.util.ListIterator;

public class M43 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(700);
		list.add(900);		
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.add(99999);
		System.out.println(list);
	}
}
