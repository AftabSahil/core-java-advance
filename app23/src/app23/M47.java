package app23;

import java.util.ArrayList;
import java.util.ListIterator;

public class M47 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(700);
		list.add(900);		
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext()) {
			System.out.println("prev index:" + it.previousIndex());
			System.out.println(it.next());
			System.out.println("next index:" + it.nextIndex());
			System.out.println("--------------");
		}
	}
}
