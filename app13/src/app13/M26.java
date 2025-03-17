package app13;


class R extends Thread{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M26 {
	public static void main(String[] args) {
		R r1 = new R();
		r1.start();
		System.out.println("done");
	}
}
