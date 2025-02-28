package app13;
class B extends Thread{
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

class C extends Thread{
	@Override
	public void run() {
		for(int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
	}
}



public class M4 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		
		C c1 = new C();
		c1.start();
		for(int i = 3000; i < 4000; i++) {
			System.out.println(i);
		}
	}
}
