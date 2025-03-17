package app23;

import java.util.ArrayList;
import java.util.ListIterator;

public class M40 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(700);
		list.add(900);		
		ListIterator<Integer> it = list.listIterator();
		int element;
		while(it.hasNext()) {
			element = it.next();
			System.out.println(element);
			if(element == 200) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}
