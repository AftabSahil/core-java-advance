package app22;
class Util{
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
class T1 extends Thread{
	Thread main;
	T1(Thread main){
		this.main = main;
	}
	@Override
	public void run() {
		//some code
		synchronized (main) {
			try{
				main.wait();				
			}
			catch(InterruptedException ex) {}
		}
		//some other code
	}
}
class T2 extends Thread{
	Thread main;
	T2(Thread main){
		this.main = main;
	}	@Override
	public void run() {
		//some code
		synchronized (main) {
			try{
				main.wait();
			}
			catch(InterruptedException ex) {}
		}
		//some other code
	}
}
class T3 extends Thread{
	Thread t;
	T3(Thread t){
		this.t = t;
	}
	@Override
	public void run() {
		//some code
		synchronized (t) {
			try{
				t.wait();
			}
			catch(InterruptedException ex) {}
		}
		//some other code
	}
}
class T4 extends Thread{
	Thread t;
	T4(Thread t){
		this.t = t;
	}
	@Override
	public void run() {
		//some code
		synchronized (t) {
			try{
				t.wait();
			}
			catch(InterruptedException ex) {}
		}
		//some other code
	}
}
class T5 extends Thread{
	Thread t1, t2;
	T5(){
		
	}
	
	void setThreads(Thread t1, Thread t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	@Override
	public void run() {
		//some code
		synchronized (t1) {
			try{
				t1.wait();
			}
			catch(InterruptedException ex) {}
		}
		//some other code
		synchronized (t2) {
			t2.notifyAll();
		}
		synchronized (this) {
			this.notifyAll();
		}
		
	}
}
public class M1 {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		T1 t1 = new T1(main);
		T2 t2 = new T2(main);
		T5 t5 = new T5();
		T3 t3 = new T3(t5);
		T4 t4 = new T4(t5);
		t5.setThreads(t1, main);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		Util.sleep(50000);
		synchronized (t1) {
			t1.notify();
		}
	}
}
