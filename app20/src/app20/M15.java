package app20;

import java.util.Scanner;

public class M15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Email");
		String s1 = sc.next();
		int atIndex = s1.indexOf('@');
		if(atIndex == -1) {
			System.out.println(s1 + " doesn't have @");
		}
		else if(s1.indexOf('@', atIndex + 1) != -1) {
			System.out.println(s1 + " containing more than @");
		}
		else {
			System.out.println(s1 + " containing @");
		}
	}
}
