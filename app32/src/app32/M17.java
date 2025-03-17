package app32;

import java.io.File;
import java.io.IOException;

public class M17 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("test.txt");
		System.out.println(f1.getName());
		System.out.println(f1.getCanonicalPath());
	}
}
