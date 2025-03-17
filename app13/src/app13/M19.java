package app13;

public class M19 {
	public static void main(String[] args) {
		new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i = 2000; i <= 3000; i++) {
					System.out.println(i);
				}
			}
		}).start();
		for(int i = 4000; i <= 5000; i++) {
			System.out.println(i);
		}		
	}
}
