package app4;

import java.util.Scanner;

public class M15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		try {
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int j = 9 / (5 - i);
			System.out.println(3);
			int[] array = {10, 20, 30, 40, 50, 56, 90, 89};
			int k = array[i];
			System.out.println(4);
		}
		catch(ArithmeticException ex) {
			System.out.println("from the 1st catch:" + ex);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("from the 2nd catch:" + ex);
		}
		catch(NumberFormatException ex) {
			System.out.println("from the 3rd catch:" + ex);
		}
		finally {
			System.out.println("from finally");
		}
		System.out.println("end");
	}
}
