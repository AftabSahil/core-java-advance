package app4;

public class M20 {
	public static void main(String[] args) {
		try {
			System.exit(0);
		}
		catch(ArithmeticException ex) {
			// some thing
		}
		finally {
			System.out.println("from finally");
		}
		System.out.println("end");
	}
}
