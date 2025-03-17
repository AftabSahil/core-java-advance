package app5;
interface E{
	void test1();
	void test2();
}
public class M9 {

	public static void main(String[] args) {
		E e1 = new E() {
			@Override
			public void test1() {
				System.out.println("aic-test1");
			}
			
			@Override
			public void test2() {
				System.out.println("aic-test2");
			}
		};
		e1.test1();
		e1.test2();
		System.out.println("done");
	}
}
