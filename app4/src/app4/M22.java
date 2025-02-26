package app4;

public class M22 {
	public static void main(String[] args) {
		int i = test();
		System.out.println(i);
	}
	static int test() {
		try {
			int i = 10 / 0;
			return 5;
		}
		catch(ArithmeticException ex) {
			return 6;
		}
		finally {
			return 7;
		}
	}
}
