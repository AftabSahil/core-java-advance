package pack1;
interface B {
	static void test1() {
		System.out.println("B-test1");
	}
	static void test2() {
		System.out.println("B-test2");
	}
}

class C implements B{
	
}

public class M2 {
	public static void main(String[] args) {
		B.test1();
		B.test2();
//		C.test1();
//		C.test2();
	}
}
