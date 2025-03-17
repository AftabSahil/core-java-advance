package app35;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M7 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("test6.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		B obj1 = (B) in.readObject();
		B obj2 = (B) in.readObject();
		C obj3 = (C) in.readObject();
		C obj4 = (C) in.readObject();
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		System.out.println(obj3.i);
		System.out.println(obj3.j);
		System.out.println(obj3.s1);
		System.out.println(obj4.i);
		System.out.println(obj4.j);
		System.out.println(obj4.s1);
	}
}
