package app14;
class E{
	static void test1() {
		Thread t1 = Thread.currentThread();
		System.out.println("from test1 " + t1.getName());
		synchronized(E.class)
		{
			for(int i = 1; i <= 1000; i++) {
				System.out.println("test1:" + i + " by " + t1.getName());
			}
		}
	}
}
class F extends Thread{
	@Override
	public void run() {
		E.test1();
	}
}
class G extends Thread{
	@Override
	public void run() {
		E.test1();
	}
}
public class M2 {
	public static void main(String[] args) {
		F f1 = new F();
		f1.start();
		
		G g1 = new G();
		g1.start();
	}
}




