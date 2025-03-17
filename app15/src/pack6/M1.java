package pack6;

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

}


class ThreadA extends Thread{
	Shared s1;
	ThreadA(Shared s1){
		this.s1 = s1;
	}
	@Override
	public void run() {
		synchronized (s1) {
			Thread t1 = Thread.currentThread();
			System.out.println(t1.getName() + " started");
			try {
				System.out.println(t1.getName() + " going to wait");
				s1.wait();
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
	Shared s1;
	ThreadB(Shared s1){
		this.s1 = s1;
	}
	@Override
	public void run() {
		synchronized (s1) {
			Thread t1 = Thread.currentThread();
			System.out.println(t1.getName() + " started");
			try {
				System.out.println(t1.getName() + " going to wait");
				s1.wait();
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
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		ThreadA t1 = new ThreadA(s1);
		ThreadB t2 = new ThreadB(s1);
		ThreadA t3 = new ThreadA(s2);
		ThreadB t4 = new ThreadB(s2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("main goining into sleep for 30 seconds");
		Util.sleep(30000);
		System.out.println("after sleep, main calling test2");
		synchronized(s1)
		{
			synchronized(s2) 
			{
				Thread th1 = Thread.currentThread();
				System.out.println(th1.getName() + " calling notifyAll in s1 and s2");
				s1.notifyAll();
				s2.notifyAll();
				System.out.println(th1.getName() + " finished notifyAll in both s1 and s2");
			}
		}
		
		
	}
}
