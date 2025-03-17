package app4;

public class M18 {
	public static void main(String[] args) {
		try {
			//some statements
			return;
		}
		catch(ArithmeticException ex) {
			// some statements
		}
		finally {
			System.out.println("from finally");
		}
		System.out.println("end");
	}
}
