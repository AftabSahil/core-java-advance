package app32;

import java.io.File;

public class M15 {
	public static void main(String[] args) {
		File f1 = new File("a/b/c/d/xyz/hello/h/t/y");
		f1.mkdirs();
		System.out.println("done");
	}
}
