package pack1;

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
	synchronized void test1() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " started");
		try {
			System.out.println(t1.getName() + " going to wait");
			wait();
			System.out.println(t1.getName() + " returned from wait");
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(t1.getName() + " end");
	}
	synchronized void test2() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + " started");
		System.out.println(t1.getName() + " is going to sleep");
		Util.sleep(15000);
		System.out.println(t1.getName() + " calling notify");
		notify();
		System.out.println(t1.getName() + " after notify");
		System.out.println(t1.getName() + " end");
	}
}


class ThreadA extends Thread{
	Shared s1;
	ThreadA(Shared s1){
		this.s1 = s1;
	}
	@Override
	public void run() {
		s1.test1();
	}
}

class ThreadB extends Thread{
	Shared s1;
	ThreadB(Shared s1){
		this.s1 = s1;
	}
	@Override
	public void run() {
		s1.test2();
	}
}

public class M1 {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		ThreadA t1 = new ThreadA(s1);
		ThreadB t2 = new ThreadB(s2);
		t1.start();
		Util.sleep(5);
		t2.start();
	}
}
