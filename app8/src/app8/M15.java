package app8;
class W < E >{
	E f1;
}
public class M15 {
	public static void main(String[] args) {
		W<? extends R> w1 = null;
		w1 = new W<R>();
		w1 = new W<S>();
		w1 = new W<T>();
//		w1 = new W<P>();
//		w1 = new W<Q>();
//		w1 = new W<Object>();
//		w1 = new W<Integer>();
//		w1 = new W<String>();
//		w1.f1 = new R();
	
	}
}
