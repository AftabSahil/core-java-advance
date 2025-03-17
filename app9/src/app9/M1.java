package app9;

class A {
	int i;
	A(int i){
		this.i = i;
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A(90);
		System.out.println(a1);
		A a2 = new A(190);
		System.out.println(a2);
	}
}
