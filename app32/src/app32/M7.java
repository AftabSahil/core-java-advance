package app32;

import java.io.File;
import java.io.IOException;

public class M7 {
	public static void main(String[] args){
		File f1 = new File("C:\\softwares\\JavaScript-lara\\abc\\Test.java");
		System.out.println(f1.exists());
		try {
			System.out.println(f1.createNewFile());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(f1.exists());
	}
}
