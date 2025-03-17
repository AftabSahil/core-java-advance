package app13;

public class M2 {
	static void test1() {
		for(int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 5000; i < 6000; i++) {
			System.out.println(i);
		}
		test1();
	}
}
