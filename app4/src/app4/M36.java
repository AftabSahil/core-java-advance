package app4;

public class M36 {
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	
	static void test1() {
		System.out.println(3);
		try {
			test2();
			
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}
		
		System.out.println(4);
	}
	static void test2() {
		System.out.println(5);
		int i = 10 / 0;
		System.out.println(6);
	}
}
