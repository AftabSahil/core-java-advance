package app4;

public class M33 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			test();
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
	static void test() {
		System.out.println(3);
		int i = 10 / 0;
		System.out.println(4);
	}
}
