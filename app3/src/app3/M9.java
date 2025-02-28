package app3;

public class M9 {
	//public static void test1(byte b1) {
	//	System.out.println("byte");
	//}
	//public static void test1(int b1) {
	//	System.out.println("int");
	//}
	//public static void test1(double b1) {
	//	System.out.println("double");
	//}
	//public static void test1(Byte b1) {
	//	System.out.println("Byte");
	//}
	//public static void test1(Number b1) {
	//	System.out.println("Number");
	//}
	public static void test1(Object b1) {
		System.out.println("Object");
	}
	public static void test1(byte ...b1) {
		System.out.println("var-arg");
		
		test1(b1);
	}
}
