package app13;

public class M8 {
	public static void main(String[] args) {
		class A extends Thread{
			@Override
			public void run() {
				for(int i = 4000; i < 5000; i++) {
					System.out.println(i);
				}
			}
		}
		A a1 =new A();
		a1.start();
		
		for(int i = 6000; i < 6000; i++) {
			System.out.println(i);
		}
	}
}
