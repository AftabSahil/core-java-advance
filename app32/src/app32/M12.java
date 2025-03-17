package app32;

import java.io.File;

public class M12 {
	public static void main(String[] args) {
		File f2 = new File("D:/abc", "hello");
		System.out.println(f2.exists());
		System.out.println(f2.mkdir());
		System.out.println(f2.exists());
	}
}
