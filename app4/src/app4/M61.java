package app4;

public class M61 {
	public static void main(String[] args) {
		try {
			//some statements
			throw new ArithmeticException();
		}
		catch(ArithmeticException ex) {
			//some statements
		}
		System.out.println("end");
	}
}
