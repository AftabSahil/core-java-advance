package app32;

import java.io.File;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("test1.html");
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println(f1.exists());
	}
}
