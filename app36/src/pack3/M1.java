package pack3;
interface A {
	void test1();
}
public class M1 {
	static void f1() {
		System.out.println("f1");
	}
	public static void main(String[] args) {
		A a1 = M1 :: f1;
		a1.test1();
	}
}
