package app8;
class A{
	String s1;
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.s1 = "abc";
//		a1.s1 = 100;

		A a2 = new A();
		a2.s1 = "xyz";
		
		A a3 = new A();
		a3.s1 = "hello";
		
		System.out.println("done");
	}
}
