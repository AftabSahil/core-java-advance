package app4;

public class M9 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			//several statements
			//several types of statements
			int i = 10 / 0;
			System.out.println(3);
		}
		catch(ArithmeticException ex) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
