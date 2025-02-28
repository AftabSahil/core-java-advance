package app5;

public class M1 {
	class A{
		
	}
	private class B{
		
	}
	protected class C{
		
	}
	public class D{
	}
		public static void main(String[] args) {
			A a1 = null;
			B b1 = null;
			C c1 = null;
			D d1 = null;
//			
//			a1 = new A();
//			b1 = new B();
//			c1 = new C();
//			d1 = new D();
			M1 obj = new M1();
			a1 = obj.new A();
			b1 = obj.new B();
			c1 = obj.new C();
			System.out.println("done");
			
			
		}
	}

