package app34;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M1 {
	public static void main(String[] args) {
		File srcFile = new File("D:\\laralogo.png");
		File destinationFile = new File("test.png");
		
		try(FileInputStream fin = new FileInputStream(srcFile);
			BufferedInputStream bin = new BufferedInputStream(fin);
			FileOutputStream fout = new FileOutputStream(destinationFile);
			BufferedOutputStream bout = new BufferedOutputStream(fout)){
			byte[] bytes = new byte[(int) srcFile.length()];
			bin.read(bytes);
			bout.write(bytes);
			System.out.println("done");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
