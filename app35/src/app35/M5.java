package app35;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M5 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("test4.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		C obj = (C) in.readObject();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.s1);
	}
}
