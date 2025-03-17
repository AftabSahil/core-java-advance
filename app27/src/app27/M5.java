package app27;

import java.util.HashSet;

class E{
	int i, j, k;
	E(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}

	@Override
	public String toString() {
		return "(i = " + i + ", j = " +  j + ", k = " + k + ")"; 
	}

	@Override
	public int hashCode() {
		int hash = Integer.toString(i).hashCode();
			hash += Integer.toString(j).hashCode();
			hash += Integer.toString(k).hashCode();
		System.out.println("hash code for " + this + ":" + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = (obj instanceof E) &&
					   (i == ((E)obj).i) &&
					   (j == ((E)obj).j) &&
					   (k == ((E)obj).k);
		System.out.println("equals b/w " + this + " and " + obj + ":" + flag);
		return flag;
	}
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E(10, 20, 30);
		E e2 = new E(10, 20, 30);
		E e3 = new E(20, 10, 30);
		E e4 = new E(20, 10, 30);
		E e5 = new E(30, 20, 10);
		E e6 = new E(30, 20, 10);
		E e7 = new E(10, 20, 300);
		E e8 = new E(10, 20, 300);
		E e9 = new E(300, 20, 10);
		E e10 = new E(300, 20, 10);
		E e11 = new E(300, 200, 10);
		E e12 = new E(300, 200, 10);
		E e13 = new E(300, 10, 20);
		E e14 = new E(300, 10, 200);
		HashSet<E> set = new HashSet<E>();
		System.out.println("e1 adding status:" + set.add(e1));
		System.out.println("--------------------------------");
		System.out.println("e2 adding status:" + set.add(e2));
		System.out.println("--------------------------------");
		System.out.println("e3 adding status:" + set.add(e3));
		System.out.println("--------------------------------");
		System.out.println("e4 adding status:" + set.add(e4));
		System.out.println("--------------------------------");
		System.out.println("e5 adding status:" + set.add(e5));
		System.out.println("--------------------------------");
		System.out.println("e6 adding status:" + set.add(e6));
		System.out.println("--------------------------------");
		System.out.println("e7 adding status:" + set.add(e7));
		System.out.println("--------------------------------");
		System.out.println("e8 adding status:" + set.add(e8));
		System.out.println("--------------------------------");
		System.out.println("e9 adding status:" + set.add(e9));
		System.out.println("--------------------------------");
		System.out.println("e10 adding status:" + set.add(e10));
		System.out.println("--------------------------------");
		System.out.println("e11 adding status:" + set.add(e11));
		System.out.println("--------------------------------");
		System.out.println("e12 adding status:" + set.add(e12));
		System.out.println("--------------------------------");
		System.out.println("e13 adding status:" + set.add(e13));
		System.out.println("--------------------------------");
		System.out.println("e14 adding status:" + set.add(e14));
		System.out.println("--------------------------------");
	}
}




