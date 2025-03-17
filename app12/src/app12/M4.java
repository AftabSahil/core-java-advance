package app12;

class D {
	
	D obj;
	
	@Override
	protected void finalize() {
		System.out.println("from finalized");
	}
}
public class M4 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("begin");
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		
		d1.obj = d2;
		d2.obj = d3;
		d3.obj = d1;
		
		d1 = null;
		d2 = null;
		// how many objects abandoned?
		System.gc();
		Thread.sleep(5000);
		System.out.println("-------------");
		d3 = null;
		// how many objects abandoned?
		System.gc();
		Thread.sleep(5000);
		System.out.println("-------------");
	}
}
