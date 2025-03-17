package app13;

class A extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}	
}

public class M3 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		
		for(int i = 5000; i < 6000; i++) {
			System.out.println(i);
		}
	}
}
