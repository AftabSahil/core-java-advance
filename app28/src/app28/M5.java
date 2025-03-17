package app28;

import java.util.ArrayList;
import java.util.Collections;

class E {
	int i;
	int j;
	int k;
	E(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", k = " + k + ")";
	}
}

public class M5 {
	public static void main(String[] args) {
		E e1 = new E(10, 20, 30);
		E e2 = new E(1, 220, 330);
		E e3 = new E(110, 0, 130);
		ArrayList<E> list = new ArrayList<E>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		Collections.sort(list, (o1, o2) -> o1.k - o2.k);
		System.out.println(list);
	
	}
}
