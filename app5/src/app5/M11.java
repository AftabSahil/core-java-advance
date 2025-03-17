package app5;

public class M11 {
	static F m1() {
		return new F() {
			@Override
			void test1() {
				System.out.println("F-test");
			}
		};
	}
	
	
	static G m2() {
		return new G() {
			@Override
			public void method1() {
				System.out.println("G-test");
			}
		};
	}
	
	public static void main(String[] args) {
		m1().test1();
		m2().method1();
	}
}
