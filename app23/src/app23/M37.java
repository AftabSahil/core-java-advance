package app23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class M37 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(700);
		list.add(900);		
		Iterator<Integer> it = list.iterator();
		it.forEachRemaining(new Consumer() {
			@Override
			public void accept(Object t) {
				System.out.println(t);
			}
		});
	
	}
}
