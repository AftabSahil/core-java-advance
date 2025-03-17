package app8;
class D{
	boolean test() {
		System.out.println("test");
		return true;
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D();
		boolean b1 = d1.test();
		
		D d2 = new D();
		boolean b2 = d2.test();
		
		D d3 = new D();
		boolean b3 = d3.test();
		
		D d4 = new D();
		boolean b4 = d4.test();
		
		System.out.println("done");
		
		
	}
}
