package app14;

class Util{
	static void sleep(long millies) {
		try {
			Thread.sleep(millies);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
class Shared{
	synchronized void test1(Shared obj) {
		Thread t1 = Thread.currentThread();
		System.out.println("test1 begin by " + t1.getName());
		Util.sleep(5000);
//		obj.test2(this);
		test2(obj);
		System.out.println("test1 end by " + t1.getName());
	}
	synchronized void test2(Shared obj) {
		Thread t1 = Thread.currentThread();
		System.out.println("test2 begin by " + t1.getName());
		Util.sleep(5000);
	//	obj.test1(this);
		test1(obj);
		System.out.println("test2 end by " + t1.getName());
	}
}

class ThreadA extends Thread{
	Shared s1, s2;
	ThreadA(Shared s1, Shared s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() {
		s1.test1(s2);
	}
}
class ThreadB extends Thread{
	Shared s1, s2;
	ThreadB(Shared s1, Shared s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() {
		s2.test2(s1);
	}
}
public class M3 {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		ThreadA t1 = new ThreadA(s1, s2);
		t1.start();
		Util.sleep(500);
		ThreadB t2 = new ThreadB(s1, s2);
		t2.start();
	}
}












