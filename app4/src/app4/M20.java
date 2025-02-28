package app4;

public class M20 {
	public static void main(String[] args) {
		try {
			//some statement
			System.exit(0);
		}
		catch(ArithmeticException ex) {
			//some statement
		}
		finally {
			System.out.println("from finally");
			
		}
		System.out.println("end");
	}
}
