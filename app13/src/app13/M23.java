package app13;

public class M23 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getPriority());
		System.out.println("=========");
		t1.setName("initiator");
	//	t1.setDaemon(true);
		t1.setPriority(10);
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getPriority());
		
	}
}
