package app33;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class M10 {
	public static void main(String[] args) {
		try(FileWriter fin = new FileWriter("test10.txt");
			BufferedWriter bin = new BufferedWriter(fin)){
			bin.write("abc xyz hello");
			bin.write("abc xyz hello");
			bin.newLine();
			bin.write("abc xyz hello");
			bin.write("abc xyz hello");
			bin.newLine();
			bin.write("abc xyz hello");
			bin.write("abc xyz hello");
			bin.newLine();
			System.out.println("done");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
