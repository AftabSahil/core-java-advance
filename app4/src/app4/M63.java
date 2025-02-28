package app4;

public class M63 {
	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch ( ArithmeticException ex) {
//			System.out.println(ex);
//			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
