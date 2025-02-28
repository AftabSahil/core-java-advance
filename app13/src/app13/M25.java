package app13;
class Q extends Thread{
	@Override
	public void run(){
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getPriority());
		System.out.println("============");
	}
}
public class M25 {
	public static void main(String[] args) {
		Q q1 = new Q();
		q1.setDaemon(true);
		q1.setName("sub");
		q1.setPriority(Thread.MAX_PRIORITY);
		q1.start();
	}
}

/*
 Thread.MAX_PRIORITY = 10
 Thread.MIN_PRIORITY = 0
 Thread.NORM_PRIORITY = 5
 
*/