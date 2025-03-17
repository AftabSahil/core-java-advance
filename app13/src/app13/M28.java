package app13;
class T extends Thread{
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
public class M28 {
	public static void main(String[] args) {
		Thread t1 =Thread.currentThread();
		t1.setPriority(8);
		
		T obj = new T();
		obj.start();
	}
}
