package app80;

class A {
	private int i;
	A(int i){
		this.i = i;
	}
	public int getI() {
		return i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
}


public class M4 {
	public static void main(String[] args) {
		A a1 = new A(90);
		System.out.println(a1.getI());
		System.out.println(a1);
	}
}
