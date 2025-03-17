package app32;

import java.io.File;
import java.io.IOException;

public class M14 {
	public static void main(String[] args) {
		File f1 = new File("D:/abc");
		File f2 = new File(f1, "test1.txt");
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
