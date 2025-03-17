package app3;

public class M6 {
	public static void main(String[] args) {
		byte b1 = 100;
		
		Byte obj1 = Byte.valueOf(b1);
		Number n1 = obj1;
		Object o1 = obj1;
		Object o2 = n1;
		System.out.println("done");
	}
}
