package app13;

public class M9 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			@Override
			public void run() {
				for(int i = 4000; i < 5000; i++) {
					System.out.println(i);
				}
			}
		};
		
		t1.start();
		
		for(int i = 6000; i < 6000; i++) {
			System.out.println(i);
		}
	}
}
