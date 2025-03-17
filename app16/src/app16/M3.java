package app16;

public class M3 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 1; i < 1000; i++) {
					System.out.println(i);
					Thread.yield();
				}
			}
		};
		
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 1000; i < 2000; i++) {
					System.out.println(i);
					Thread.yield();
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}
