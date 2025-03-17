package app80;
class B {
	private int i;
	private int j;
	B(int i, int j){
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	public B setI(int i) {
		B obj = new B(i, j);
		return obj;
	}
	public B setJ(int j) {
		B obj = new B(i, j);
		return obj;
	}
	public B set(int i, int j) {
		B obj = new B(i, j);
		return obj;
	}
	
	@Override
	public String toString() {
		return "address:" + super.toString() + " and state ==> i = " + i + ", j = " + j;
	}
	
	
}

public class M5 {
	public static void main(String[] args) {
		B b1 = new B(9, 10);
		System.out.println(b1);
		B b2 = b1.setI(30);
		System.out.println(b2);
		B b3 = b1.setJ(300);
		System.out.println(b3);
		B b4 = b1.set(130, 230);
		System.out.println(b4);
		
	}
}







