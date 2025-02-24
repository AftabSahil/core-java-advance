package app4;

public class M18 {
	public static void main(String[] args) {
		int i = 10 / 0;
		if (true) {
			return;
		}
		
		try {
			//some statement
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
