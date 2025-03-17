package app13;
class P extends Thread{
	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getPriority());
		System.out.println("=========");
	}
}
public class M24 {
	public static void main(String[] args) {
		P obj = new P();
//		obj.start();
		obj.run();
	}
}
