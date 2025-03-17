package pack1;
interface D {
	default void test1() {
		System.out.println("D-test1");
	}
	void test2();
}
class E implements D {
	public void test2() {
		System.out.println("E.test2");
	}
}
public class M4 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.test1();
		e1.test2();
	}
}
