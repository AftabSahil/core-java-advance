package app14;

class Product{
	//several members
	/*
	synchronized void test1() {
		Thread t1 = Thread.currentThread();
		for(int i = 1; i < 1000; i++) {
			System.out.println(this + ":test1-" + t1.getName() + ":" + i);
		}
	}

	synchronized void test2() {
		Thread t1 = Thread.currentThread();
		for(int i = 1; i < 1000; i++) {
			System.out.println(this + ":test2-" + t1.getName() + ":" + i);
		}
	}
	
	synchronized void test3() {
		Thread t1 = Thread.currentThread();
		for(int i = 1; i < 1000; i++) {
			System.out.println(this + ":test3-" + t1.getName() + ":" + i);
		}
	}
	*/
	
	void test1() {
		Thread t1 = Thread.currentThread();		
		System.out.println("test1 started by " + t1.getName());
		synchronized(this) {
			for(int i = 1; i < 500; i++) {
				System.out.println(this + ":test1-" + t1.getName() + ":" + i);
			}
		}
	}

	void test2() {
		Thread t1 = Thread.currentThread();
		System.out.println("test2 started by " + t1.getName());
		synchronized(this)
		{
			for(int i = 1; i < 500; i++) {
				System.out.println(this + ":test2-" + t1.getName() + ":" + i);
			}
		}
	}
	
	void test3() {
		Thread t1 = Thread.currentThread();
		System.out.println("test3 started by " + t1.getName());
		synchronized(this)	//	mutext
		{
			for(int i = 1; i < 500; i++) {
				System.out.println(this + ":test3-" + t1.getName() + ":" + i);
			}
		}
	}
}

class A extends Thread{
	Product pdr;
	@Override
	public void run() {
		//use pdr
		pdr.test1();
	}
}
class B extends Thread{
	Product pdr;
	@Override
	public void run() {
		//use pdr
		pdr.test2();
	}
}
class C extends Thread{
	Product pdr;
	@Override
	public void run() {
		//use pdr
		pdr.test3();
	}
}

public class M1 {
	public static void main(String[] args) {
		Product pdr1 = new Product();
//		Product pdr2 = new Product();
	
		A a1 = new A();
		a1.pdr = pdr1;
		
		B b1 = new B();
		b1.pdr = pdr1;
		
		C c1 = new C();
		c1.pdr = pdr1;
		
		a1.start();
		b1.start();
		c1.start();
		
		System.out.println("done");
		
	}
}
