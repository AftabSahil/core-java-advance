package app4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M66 {
	public static void main(String[] args) {
		//ARC
		File f1 = new File("D:\\feb-dev\\core-java-advanced\\app4\\src\\app4\\M66.java");
		try(FileReader fin = new FileReader(f1);
			BufferedReader bin = new BufferedReader(fin))
		{
			String s1 = bin.readLine();
			while(s1 != null)
			{
				System.out.println(s1);
				s1 = bin.readLine();
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
	}
}
