package pack1;
class A{
	int i;
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 100;
		
		A a2 = new A();
		a2.i = 200;
		
		A a3 = new A();
		a3.i = 300;
		
		A a4 = new A();
		a4.i = 400;
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		System.out.println(a4.i);
		
		
	}
}
