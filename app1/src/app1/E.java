package app1;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String s1 = sc.next();
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("enter weight");
		double weight = sc.nextDouble();
		System.out.println("you are a graduate. true/false?");
		boolean amIGraduate = sc.nextBoolean();
		System.out.println("your data");
		System.out.println("name:" + s1);
		System.out.println("age:" + age);
		System.out.println("weight:" + weight);
		System.out.println("graduation completed:" + amIGraduate);
	}
}
