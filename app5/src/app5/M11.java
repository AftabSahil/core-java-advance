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
	
	static G m2 {
		return new G() {
			@Override
			public void methord1() {
				System.out.println("testmethord 1");
				
			}
		};
	}
}
