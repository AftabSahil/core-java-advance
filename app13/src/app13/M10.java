package app13;

public class M10 {
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				for(int i = 4000; i < 5000; i++) {
					System.out.println(i);
				}
			}
		}.start();
		
		for(int i = 6000; i < 6000; i++) {
			System.out.println(i);
		}
	}
}
