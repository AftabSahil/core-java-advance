package app35;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M13 {
	public static void main(String[] args) throws Exception{
		
		FileInputStream fin = new FileInputStream("test12.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		J obj = (J) in.readObject();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
	}
}
