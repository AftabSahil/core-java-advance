package pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class M10 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 1000; i++) {
			list.add(i);
		}
		Spliterator<Integer> splIt = list.spliterator();
		Spliterator<Integer> splitIt1 = splIt.trySplit();
		new Thread() {
			public void run() {
				splitIt1.forEachRemaining(t1 -> System.out.println("spl1 iterator:" + t1));
			}
		}.start();
		Spliterator<Integer> splitIt2 = splIt.trySplit();
		new Thread() {
			public void run() {
				splitIt2.forEachRemaining(t1 -> System.out.println("spl2 iterator:" + t1));
			}
		}.start();
		Spliterator<Integer> splitIt3 = splIt.trySplit();
		new Thread() {
			public void run() {
				splitIt3.forEachRemaining(t1 -> System.out.println("spl3 iterator:" + t1));
			}
		}.start();

	}
}
