package app4;

public class M19 {
	public static void main(String[] args) {
		try {
			//some statements
			int i = 10 / 0;
		}
		catch(ArithmeticException ex) {
			// some statements
			return;
		}
		finally {
			System.out.println("from finally");
		}
		System.out.println("end");
	}
}
