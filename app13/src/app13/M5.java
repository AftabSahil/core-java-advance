package app13;
class D extends Thread{
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M5 {
	public static void main(String[] args) {
		D d1 = new D();
		d1.start();
		
		D d2 = new D();
		d2.start();
		
		for(int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
	}
}
