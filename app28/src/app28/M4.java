package app28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class D {
	int i;
	int j;
	D(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
}

class S1 implements Comparator<D>{
	@Override
	public int compare(D o1, D o2) {
		return o1.i - o2.i;
	}
}

class S2 implements Comparator<D>{
	@Override
	public int compare(D o1, D o2) {
		return o1.j - o2.j;
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(10, 20);
		D d2 = new D(140, 120);
		D d3 = new D(10, 240);
		D d4 = new D(105, 520);
		D d5 = new D(610, 260);
		D d6 = new D(1, 60);
		ArrayList<D> list = new ArrayList<D>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		list.add(d6);
//		System.out.println(list);
//		Collections.sort(list, new S1());
//		System.out.println(list);
//		Collections.sort(list, new S2());
//		System.out.println(list);
//		System.out.println(list);
//		Collections.sort(list, new Comparator<D>() {
//			@Override
//			public int compare(D o1, D o2) {
//				return o1.i - o2.i;
//			}
//		});
//		System.out.println(list);
//		Collections.sort(list, new Comparator<D>() {
//			@Override
//			public int compare(D o1, D o2) {
//				return o1.j - o2.j;
//			}
//		} );
//		System.out.println(list);

		System.out.println(list);
		Collections.sort(list, (o1, o2) -> o1.i - o2.i);
		System.out.println(list);
		Collections.sort(list, (o1, o2) -> o1.i - o2.i);
		System.out.println(list);

	
	
	}
}








