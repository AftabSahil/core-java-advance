package app16;
class P extends Thread{
	P(ThreadGroup tg, String name){
		super(tg, name);
	}
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
class Q implements Runnable{
	@Override
	public void run() {
		for(int i = 1000; i <= 2000; i++) {
			System.out.println(i);
		}
	}
}
public class M5 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("my firstgroup");
		P p1 = new P(tg, "first thread");
		P p2 = new P(tg, "2nd thread");
		P p3 = new P(tg, "3rd thread");
		P p4 = new P(tg, "4th thread");
		
		Q q1 = new Q();
		Thread t1 = new Thread(tg, q1,"5th  thread");
		Thread t2 = new Thread(tg, q1,"6th  thread");
		Thread t3 = new Thread(tg, q1,"7th  thread");
		Thread t4 = new Thread(tg, q1,"8th  thread");
	
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		tg.stop();	
		
		
		System.out.println("priority:" + t4.getPriority());
		System.out.println("priority:" + p4.getPriority());
		System.out.println("priority:" + t3.getPriority());
		System.out.println("priority:" + p2.getPriority());
		System.out.println("priority:" + t1.getPriority());
		
	}
	
	
	
}
