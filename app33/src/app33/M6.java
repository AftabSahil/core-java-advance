package app33;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M6 {
	public static void main(String[] args){
		File f1 = new File("test6.txt");
		FileWriter out = null;
		try {
			out = new FileWriter(f1, true);
			out.write("abc xyz hello");
			out.write("abc xyz hello");
			out.write("\n");
			out.write("abc xyz hello");
			out.write("abc xyz hello");
			out.write("abc xyz hello");
			out.write("\n");
			out.write("---------------");
			out.write("\n");
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out != null) {
				try {
					out.flush();
					out.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		System.out.println("done");
	}
}
