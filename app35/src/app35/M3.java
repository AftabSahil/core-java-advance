package app35;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M3 {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("test2.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		B obj = (B) in.readObject();
		System.out.println(obj.i);
	}
}
