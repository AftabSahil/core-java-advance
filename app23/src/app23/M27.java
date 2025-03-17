package app23;

import java.util.ArrayList;
import java.util.Scanner;

public class M27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list  = new ArrayList<Integer>();
		int element;
		String oneMore;
		do
		{
			System.out.println("enter int element");
			element = sc.nextInt();
			if(!list.contains(element)) {
				list.add(element);
			}
			else {
				System.out.println(element + " already added");
			}
			System.out.println("do you want to add one more? (yes/no)");
			oneMore = sc.next();
		}while("yes".equalsIgnoreCase(oneMore));
		System.out.println("all entered elements:" + list);
	}
}
