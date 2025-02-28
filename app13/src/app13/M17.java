package app13;

public class M17 {
		public static void main(String[] args) {
			Runnable r1 = new Runnable(){
				@Override
				public void run() {
					for(int i = 4000; i <= 5000; i++) {
				System.out.println(i);
			}
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i = 4000; i <= 5000; i++) {
			System.out.println(i);
		}
		}
}
