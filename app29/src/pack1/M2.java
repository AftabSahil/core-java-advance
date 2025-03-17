package pack1;

class B{
	int i;
	B ref;
	
	B(int i){
		this.i = i;
	}
}


public class M2 {
	public static void main(String[] args) {
		B b1 = new B(100);
		B b2 = new B(200);
		B b3 = new B(300);
		B b4 = new B(400);
		b1.ref = b2;
		b2.ref = b3;
		b3.ref = b4;
		b4.ref = b1;
		
		System.out.println(b1.i);
		System.out.println(b1.ref.i);
		System.out.println(b1.ref.ref.i);
		System.out.println(b1.ref.ref.ref.i);
	}
}
