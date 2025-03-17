package app30;

import java.util.ArrayList;
class A{
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

class ThreadA extends Thread{
	ArrayList<Integer> list;
	ThreadA(ArrayList<Integer> list){
		this.list = list;
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}
}
class ThreadB extends Thread{
	ArrayList<Integer> list;
	ThreadB(ArrayList<Integer> list){
		this.list = list;
	}
	public void run() {
		for(int i = 20; i <= 30; i++) {
			list.add(i);
		}
	}
}
public class M1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//non synchronized
		
		
		
		list = new Util(list);
		//its a synchronized
		new ThreadA(list).start();
		new ThreadB(list).start();
		
		
	}
}
