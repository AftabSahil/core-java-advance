package app35;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M11 {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("test10.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		I obj = (I) in.readObject();
		System.out.println(obj.a);
	}
}
