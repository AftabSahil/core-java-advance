package pack1;

interface A {
	static void test() {
		System.out.println("A=test");
	}
}

public class M1 {
	public static void main(String[] args) {
		A.test();
	}
}
