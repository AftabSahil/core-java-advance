package app6;

import java.util.Iterator;

public class M6 {
//	public static void main(String[] args) {
//		for(int i = 1; i <=6;i++) {
//			for(int j = 1)
//		}
//	}
	public static void main(String[] args) {
		for(int i = 6; i < 0; i--) {
			for(int j = i; j >= 0; j--) {
				System.out.println((char) (j+90));
			}
			System.out.print();
			
		}
	}

}



/*
		1
		2 1
		3 2 1 
		4 3 2 1
		5 4 3 2 1 
		6 5 4 3 2 1
*/