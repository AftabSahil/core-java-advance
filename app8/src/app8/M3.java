package app8;
class C{
	void test(String s1) {
		System.out.println("test:" + s1);
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.test("abc");
		
		C c2 = new C();
		c2.test("xyz");
		
		C c3 = new C();
		c3.test("hello");
		
		
	}
}
