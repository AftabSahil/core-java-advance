package app23;

import java.util.ArrayList;
import java.util.Iterator;

public class M32 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(700);
		list.add(900);		
		Iterator<Integer> it = list.iterator();
		int element;
		while(it.hasNext()) {
			element  = it.next();
			//System.out.println(element);
			if(element == 400) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}
