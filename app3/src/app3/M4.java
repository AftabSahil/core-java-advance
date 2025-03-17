package app3;

public class M4 {
	public static void main(String[] args) {
		Integer i = 90;	//	Integer i = Integer.valueOf(i);
		test(i);	//	test(i.intValue());
	}
	static void test(int param)
	{
		System.out.println("test");
	}
}
