package app13;

public class M6 {
	class A extends Thread{
		@Override
		public void run() {
			for(int i = 1; i < 1000; i++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
//		A a1 = new A();
		A a2 = new M6().new A();
		a2.start();
		
		for(int i = 4000; i < 5000; i++) {
			System.out.println(i);
		}
	}
}
