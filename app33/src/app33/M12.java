package app33;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class M12 {
	public static void main(String[] args) {
		try(FileReader fin = new FileReader("test5.txt");
			 BufferedReader bin = new BufferedReader(fin)) {
			String s1 = null;
			while((s1 = bin.readLine()) != null) {
				System.out.println(s1);
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
