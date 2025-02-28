package app3;

public class M12 {
	public static void main(String[] args) {
		test();
		test("abc");
		test("abc", "xyz");
		test("abc", "xyz", "hello");
		test("abc", "xyz", "hello", "xyz", "java", "btm");
	}
	
	static void test(String ...strings )
	{
		System.out.println("test" + Arrays.toString(strings));
	}
}
