package app23;

import java.util.ArrayList;
import java.util.Iterator;

public class M34 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(700);
		list.add(900);		
		Iterator<Integer> it = list.iterator();
		list.add(40000);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
