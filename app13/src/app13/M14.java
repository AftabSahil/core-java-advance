package app13;

public class M14 {
	class  A implements Runnable{
		@Override
		public void run() {
			for(int i = 2000; i <= 3000; i++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		M14 obj = new M14();
		A a1 = obj.new A();
		Thread t1 = new Thread(a1);
		t1.start();
		for(int i = 4000; i <= 5000; i++) {
			System.out.println(i);
		}		
	}
}
