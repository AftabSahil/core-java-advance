package app12;

class B {
	@Override
	protected void finalize() {
		System.out.println("from finalize");
	}
}

public class M2 {
	public static void main(String[] args) {
		B b1 = new B();
		b1 = null;
		System.gc();//	Runtime.getRuntime().gc();
		System.out.println("done");
	}
}
