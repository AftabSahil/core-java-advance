package app4;

public class M19 {
	public static void main(String[] args) {
		int i = 10 / 0;
		if (true) {
			return;
		}
		
		try {
			//some statement
			i = 
		}
		catch(ArithmeticException ex) {
			//some statement
			return;
		}
		finally {
			System.out.println("from finally");
			
		}
		System.out.println("end");
	}
}
