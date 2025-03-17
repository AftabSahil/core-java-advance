package app28;

import java.util.ArrayList;

class C implements Comparable<C>{
	int i;
	int j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
	@Override
	public int compareTo(C o) {
		return j - o.j;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(10, 20);
		C c2 = new C(100, 0);
		C c3 = new C(2000, 2);
		C c4 = new C(3, 202);
		C c5 = new C(130, 20);
		ArrayList<C> list = new ArrayList<C>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		System.out.println(list);
	}
}
