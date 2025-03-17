package app33;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M5 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("test5.txt");
		FileWriter out = new FileWriter(f1, true);
		out.write("abc xyz hello");
		out.write("abc xyz hello");
		out.write("\n");
		out.write("abc xyz hello");
		out.write("abc xyz hello");
		out.write("abc xyz hello");
		out.write("\n");
		out.write("---------------");
		out.write("\n");
//		out.flush();
		out.close();
		System.out.println("done");
	}
}
