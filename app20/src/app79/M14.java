package app79;

import java.util.Scanner;

public class M14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email");
		String s1 = sc.next();
		int atIndex = s1.indexOf('@');
		if(atIndex == -1) {
			System.out.println(s1 + " doesn't have @");
		}
		else {
			System.out.println(s1 + " contaning @");
		}
	}
}
