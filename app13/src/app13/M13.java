package app13;
class N implements Runnable{
	@Override
	public void run() {
		for(int i = 1000; i <= 2000; i++) {
			System.out.println(i);
		}
		
	}
}
class O implements Runnable{
	@Override
	public void run() {
		for(int i = 2000; i <= 3000; i++) {
			System.out.println(i);
		}
		
	}
}
public class M13 {
	public static void main(String[] args) {
		N n1 = new N();
		Thread t1 = new Thread(n1);
		t1.start();
		
		N o1 = new N();
		Thread t2 = new Thread(o1);
		t2.start();
		
		for(int i = 3000; i <= 4000; i++) {
			System.out.println(i);
		}
	}
}
