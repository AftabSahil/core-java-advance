package app13;

class V extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);	//it is a static method in thread class
			} 
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
class W extends Thread{
	@Override
	public void run() {
		for(int i = 30; i <= 40; i++) {
			System.out.println("from W:" + i);
			try {
				Thread.sleep(5000);	
			} 
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}

public class M31 {
	public static void main(String[] args) {
		V v1 = new V();
		v1.start();
		
		W w1 = new W();
		w1.start();
		
		for(int i = 70; i <= 80; i++) {
			System.out.println("from main:" + i);
			try {
				Thread.sleep(5000);	
			} 
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}