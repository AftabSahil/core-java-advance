package app12;

class C{
	static C obj;
	@Override
	protected void finalize() {
		System.out.println("finalize called");
		obj = this;
	}
}
public class M3 {
	public static void main(String[] args) throws InterruptedException {
		C c1 = new C();
		System.out.println("a:" + c1);
		System.out.println("b:" + C.obj);
		c1 = null;
		System.gc();
		Thread.sleep(50000);
		System.out.println("c:" + c1);
		System.out.println("d:" + C.obj);
		
		
		C.obj = null;
		System.gc();
		Thread.sleep(50000);
		System.out.println("e:" + c1);
		System.out.println("f:" + C.obj);
		
		
		
		
	}
}
