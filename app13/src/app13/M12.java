package app13;

class M implements Runnable{
	@Override
	public void run() {
		for(int i = 1000; i <= 2000; i++) {
			System.out.println(i);
		}
	}
}
public class M12 {
	public static void main(String[] args) {
		M obj = new M();
		Thread t1 = new Thread(obj);
		t1.start();
		Thread t2 = new Thread(obj);
		t2.start();
		for(int i = 4000; i <= 5000; i++) {
			System.out.println(i);
		}
	}
}
