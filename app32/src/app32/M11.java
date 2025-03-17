package app32;

import java.io.File;

public class M11 {
	public static void main(String[] args) {
		File f1 = new File("D:/abc");
		File f2 = new File(f1, "xyz");
		System.out.println(f2.exists());
		System.out.println(f2.mkdir());
		System.out.println(f2.exists());
	}
}
