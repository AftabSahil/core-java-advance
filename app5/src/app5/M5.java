package app5;
class A{
	void test1() {
		System.out.println("A-test1");
	}
	void test2() {
		System.out.println("A-test");
	}
}
public class M5 {
	public static void main(String[] args) {
//		A a1 = new A();
//		a1.test1();
//		a1.test2();
		
//		A a2 = new A() {
//		};
//			a2.test1();
//			a2.test2();
		
//			A a3 = new A() {
//				void test1() {
//					System.out.println("AIC-test1");
//				}
//			};
//			a3.test1();
//			a3.test2();
//		
//			A a4 = new A() {
//				void test1() {
//					System.out.println("AIC-test1");
//				}
//			};
//			a4.test1();
//			a4.test2();
			
//			A a5 = new A() {
//				void test1() {
//					System.out.println("AIC-test1");
//				}
//				void test2() {
//					System.out.println("AIC-test1");
//				}
//			};
//			a5.test1();
//			a5.test2();
//			
			A a6 = new A() {
				void test1() {
					System.out.println("AIC-test1");
				}
				void test2() {
					System.out.println("AIC-test2");
				}
				void test3() {
					System.out.println("AIC-test3");
				}
			};
			a6.test1();
			a6.test2();
		//	a6.test3();
			
			A a7 = new A() {
				void test1() {
					System.out.println("AIC-test1");
				}
				void test2() {
					System.out.println("AIC-test2");
				}
				void test3() {
					System.out.println("AIC-test3");
				}
			};
			a7.test1();
			a7.test2();
			
			A a8 = new A() {
				void test1() {
					System.out.println("AIC-test1");
				}
				void test2() {
					System.out.println("AIC-test2");
				}
				void test3() {
					System.out.println("AIC-test3");
				}
			};
			a8.test1();
			a8.test2();
			
	}
}
