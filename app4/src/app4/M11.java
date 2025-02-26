package app4;

public class M11 {
	public static void main(String[] args) {
		System.out.println(1);
		int i = 10 / 0;
		try {
			System.out.println(2);
			//several statements
			// several types of statements
			System.out.println(3);
		}	
		catch(ArithmeticException ex) {		//	Throwable
			System.out.println(4);
			//severel statements
			//several types of statements 
		}
		System.out.println(5);
	}
}
