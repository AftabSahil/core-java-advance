package app13;



public class M7 {
	static class A extends Thread{
		@Override
		public void run() {
			for(int i = 1; i < 1000; i++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
//		A a1 = new A();
		A a1 = new A();
		a1.start();
		
		for(int i = 4000; i < 5000; i++) {
			System.out.println(i);
		}
	}
}
