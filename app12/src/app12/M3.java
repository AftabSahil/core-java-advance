package app12;

class C{
	static C obj1, obj2;	
	@Override
	protected void finalize(){
		System.out.println("finalize called");
		obj1 = this;
		obj2 = obj1;
	}
}
public class M3 {
	public static void main(String[] args) throws InterruptedException{
		C c1 = new C();
		System.out.println("a:" + c1);
		System.out.println("b:" + C.obj1);
		System.out.println("c:" + C.obj2);
		c1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("d:" + c1);
		System.out.println("e:" + C.obj1);		
		System.out.println("f:" + C.obj2);		
		C.obj1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("g:" + c1);
		System.out.println("h:" + C.obj1);
		System.out.println("i:" + C.obj2);
		C.obj2 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("j:" + c1);
		System.out.println("k:" + C.obj1);
		System.out.println("l:" + C.obj2);
	}
}








