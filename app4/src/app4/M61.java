package app4;

public class M61 {
	public static void main(String[] args) {
		try {
			// some statement
			throw new ArithmeticException();
		} catch (ArithmeticException ex) {
			// some statement
		}
		System.out.println("end");
	}
}
