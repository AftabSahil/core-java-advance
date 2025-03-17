package app23;

import java.util.ArrayList;

public class M28 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(700);
		list.add(900);		
		System.out.println(list);		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		for(int i : list) {
			System.out.print(i + ", ");
		}
		System.out.println();		
	}
}
