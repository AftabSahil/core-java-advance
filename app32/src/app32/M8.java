package app32;

import java.io.File;

public class M8 {
	public static void main(String[] args) {
		File f1 = new File("abc");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
		
	}
}
