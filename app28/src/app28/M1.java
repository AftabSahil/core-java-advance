package app28;

import java.util.ArrayList;
import java.util.Collections;

class A{
	int i;
	A(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A(90);
		A a2 = new A(190);
		A a3 = new A(10);
		ArrayList<A> list = new ArrayList<A>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		System.out.println(list);
//		Collections.sort(list);
		System.out.println(list);
	}
}
