package app4;

public class M12 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);
		}	
		catch(ArithmeticException ex) {		//	Throwable
			System.out.println(4);
			int i = 10 / 0;
			System.out.println(44);
		}
		System.out.println(5);
	}
}
