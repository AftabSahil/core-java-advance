package app32;

import java.io.File;
import java.io.IOException;

public class M13 {
	public static void main(String[] args) {
		File f2 = new File("D:/abc", "hello.txt");
		System.out.println(f2.exists());
		try {
			System.out.println(f2.createNewFile());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(f2.exists());
	}
}
