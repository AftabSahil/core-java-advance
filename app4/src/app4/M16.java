package app4;

public class M16 {
	public static void main(String[] args) {
		int i = 10 / 0;		
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
