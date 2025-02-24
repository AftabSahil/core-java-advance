package app4;

public class M21 {
	public static void main(String[] args) {
		int i = test();
		System.out.println(i);
		
	}
	static int test() {
		try {
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
