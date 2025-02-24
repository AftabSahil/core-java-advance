package app1;

import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value:");
		int i = sc.nextInt();
		System.out.println("Enter string value:");
		sc.nextLine();
		String s1 = sc.nextLine();
		System.out.println(i);
		System.out.println(s1);
		System.out.println("end");
	}
}
