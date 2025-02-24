package app3;

import java.util.Arrays;

public class M11 {
	static void test(String s1, int ... varArgs) {
		System.out.println("test" + s1);
		System.out.println("test:" + Arrays.toString(varArgs) );
		System.out.println("-----------------");
	}
	public static void main(String[] args) {
		test("abc");
		test("xyz", 10, 20);
		test("hello", 45, 12, 45, 4567);
		test("xyz", 2, 4, 5, 80, 56006, 56, 45);
		test("abc", 4);
		test("test", 34, 56, 6);
		
	}
}
