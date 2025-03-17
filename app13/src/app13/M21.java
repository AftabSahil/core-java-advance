package app13;

public class M21 {
	public static void main(String[] args) {
		new Thread(() -> {
				System.out.println("abc");
				System.out.println("xyz");
		}).start();
	}
}
