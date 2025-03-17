package app33;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class M11 {
	public static void main(String[] args) {
		try(FileReader fin = new FileReader("test5.txt");
			 BufferedReader bin = new BufferedReader(fin)) {
			String s1 = bin.readLine();
			while(s1 != null) {
				System.out.println(s1);
				s1 = bin.readLine();
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
