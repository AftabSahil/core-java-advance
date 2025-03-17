package pack7;

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
class ThreadA extends Thread{

	@Override
	public void run() {
		synchronized (this) {
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
	}
}

class ThreadB extends Thread{

	@Override
	public void run() {
		synchronized (this) {
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
	}
}

public class M1 {
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadA t3 = new ThreadA();
		ThreadB t4 = new ThreadB();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("main goining into sleep for 30 seconds");
		Util.sleep(30000);
		System.out.println("after sleep, main calling test2");
		Thread th1 = Thread.currentThread();
		System.out.println(th1.getName() + " calling notify in all thread");
		synchronized(t1)
		{
		
			t1.notify();
		}
		synchronized(t2)
		{
			t2.notify();
		}
		synchronized(t3)
		{		
			t3.notify();
		}
		synchronized(t4)
		{			
			t4.notify();
		}
		System.out.println("done");
		
		
	}
}
