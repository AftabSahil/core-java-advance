package app13;

public class M18 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i = 2000; i <= 3000; i++) {
			System.out.println(i);
		}
			
		}
	});
	t1.start();
	for(int i = 4000; i <= 5000; i++) {
		System.out.println(i);
	}
  }
}
