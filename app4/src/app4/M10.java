package app4;

public class M10 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			//several statements
			//several types of statements
			System.out.println(3);
		}
		catch(ArithmeticException ex) {		// throwable
			System.out.println(4);
			//several statements
			//several types of statements
		}
		System.out.println(5);
	}
}
