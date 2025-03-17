package app5;

interface H{
	void test1();
}

public class M12 {
	public static void main(String[] args) {
		H h1 = new H() {
			public void test1()
			{
				System.out.println("H-test1");
			}
		};
		h1.test1();
		System.out.println("------------");
		H h2 = () -> System.out.println("H-test1-lambda");
		h2.test1();
	}
}
