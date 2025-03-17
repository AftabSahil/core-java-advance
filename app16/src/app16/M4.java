package app16;
class ThreadA extends Thread{
	ThreadLocal<Integer> t;
	ThreadA(ThreadLocal<Integer> t){
		this.t = t;
	}
	
	@Override
	public void run() {
		System.out.println("a:" + t.get());
		t.set(10);
		Util.sleep(500);		
		System.out.println("b:" + t.get());
		t.set(20);
		Util.sleep(500);		
		System.out.println("c:" + t.get());
		t.set(30);
		Util.sleep(500);		
	}	
}
class ThreadB extends Thread{
	ThreadLocal<Integer> t;
	ThreadB(ThreadLocal<Integer> t){
		this.t = t;
	}	
	@Override
	public void run() {
		System.out.println("d:" + t.get());
		t.set(40);
		Util.sleep(500);		
		System.out.println("e:" + t.get());
		t.set(50);
		Util.sleep(500);		
		System.out.println("f:" + t.get());
		t.set(60);
		Util.sleep(500);		
	}	
}
public class M4 {
	public static void main(String[] args) {
		ThreadLocal<Integer> t = new ThreadLocal<Integer>();
		t.set(200);		
		ThreadA a1 = new ThreadA(t);
		a1.start();
		Util.sleep(100);
		ThreadB b1 = new ThreadB(t);
		b1.start();
		Util.sleep(10000);
		System.out.println("end:" + t.get());
	}
}









