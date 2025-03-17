package app13;

public class M20 {
	public static void main(String[] args) {
		
		Runnable r1 = () -> {
				for(int i = 2000; i <= 3000; i++) {
					System.out.println(i);
				}
			};
		
		new Thread(r1).start();
		for(int i = 4000; i <= 5000; i++) {
			System.out.println(i);
		}		
	}
}
