package app23;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.function.Consumer;

public class M44 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(700);
		list.add(900);		
		ListIterator<Integer> it = list.listIterator();
		it.forEachRemaining(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
	}
}
