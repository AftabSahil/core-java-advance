package app13;
class U extends Thread{
	public void run(){
		System.out.println("first");
	}
}
public class M29 {
	public static void main(String[] args) {
		U obj = new U();
		obj.start();
		try {
			obj.join();
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
		System.out.println("main");
	}
}
