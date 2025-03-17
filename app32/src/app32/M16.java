package app32;

import java.io.File;

public class M16 {
	public static void main(String[] args) {
		File f1 = new File("abc");
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
	}
}
