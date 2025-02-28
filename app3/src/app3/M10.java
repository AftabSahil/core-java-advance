package app3;

public class M10 {
	public static void main(String[] args) {
		test();
		test(1);
		test(50);
		test(34, 67, 78, 50);
		test(34, 6);
		test(5677, 566);
	}
	static void test(int ... params) {
		System.out.println(params.length);
		for(int i : params) {
			System.out.println(i);
		}
		System.out.println("------------");
	}
}
