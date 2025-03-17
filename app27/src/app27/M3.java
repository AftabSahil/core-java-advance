package app27;

import java.util.HashSet;

class C{
	int i;
	C(int i){
		this.i = i;
	}
	public String toString() {
		return "(i = "+ i + ")";
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(90);
		C c2 = new C(90);
		C c3 = new C(190);
		C c4 = new C(190);
		HashSet<C> set = new HashSet<C>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		System.out.println(set);
	}
}
