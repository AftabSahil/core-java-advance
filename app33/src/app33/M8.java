package app33;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M8 {
	public static void main(String[] args) {
		File f1 = new File("test1.txt");
		try(FileReader in = new FileReader(f1)){
			char[] c1 = new char[10];
			in.read(c1);
			String s1 = new String(c1);
			System.out.println(s1);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
