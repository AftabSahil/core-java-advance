package app8;

class Y<E>{
	E f1;
}
public class M17 {
	public static void main(String[] args) {
		Y<? super R> y1 = null;
		y1 = new Y<R>();
		y1 = new Y<P>();
		y1 = new Y<Q>();
		y1 = new Y<Object>();

		
//		y1 = new Y<S>();
//		y1 = new Y<T>();
//		y1 = new Y<String>();
//		y1 = new Y<Integer>();
//		y1 = new Y<Double>();
		
		y1.f1 = new R();
		y1.f1 = new S();
		y1.f1 = new T();
//		y1.f1 = new Q();
//		y1.f1 = new P();
//		y1.f1 = new Object();
		

	}
}
