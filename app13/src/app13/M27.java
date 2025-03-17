package app13;

class S extends Thread{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M27 {
	public static void main(String[] args) {
		S obj = new S();
		obj.setDaemon(true);
		obj.start();
		System.out.println("done");
	}
}
