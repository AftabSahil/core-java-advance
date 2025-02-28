package app8;

class V < E > {
	E f1;
}


public class M14 {
	public static void main(String[] args) {
		V<? extends Number> v1 = null;
		v1 = new V<Number>();
//		v1 = new V<Object>();
		v1 = new V<Integer>();
		v1 = new V<Byte>();
		v1 = new V<Double>();
//		v1 = new V<String>();
//		v1 = new V<Thread>();
		//v1.f1 = 1.5;
		
		
	}
}
