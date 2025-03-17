package app4;

public class M17 {
	public static void main(String[] args) {
		if(true) {
			return;
		}
		try {
			//some statements
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
