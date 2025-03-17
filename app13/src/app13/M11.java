package app13;
class L implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M11 {
	public static void main(String[] args) {
		L obj = new L();
		Thread t1 = new Thread(obj);
		t1.start();
		for(int i = 1000; i <= 2000; i++) {
			System.out.println(i);
		}
	}
}
