package pack3;
interface B{
	void test1();
}
class C{
	static void m1() {
		System.out.println("I am from M1");
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = C :: m1;
		b1.test1();
	}
}
