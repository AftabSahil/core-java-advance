package app4;

public class M62 {
	public static void main(String[] args) {
		try {
			// some statement
			int i = 10 / 0;
		} catch (ArithmeticException ex) {
			// some statement
			throw new ArithmeticException(ex.getMessage());
		}
		System.out.println("end");
	}
}
