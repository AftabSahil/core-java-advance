package app35;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class M6 {
	public static void main(String[] args) throws Exception{
		B b1 = new B(90);
		B b2 = new B(190);
		C c1 = new C(10, 35.56, "abc");
		C c2 = new C(20, 235.56, "xyz");
		FileOutputStream fout = new FileOutputStream("test6.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(b1);
		out.writeObject(b2);
		out.writeObject(c1);
		out.writeObject(c2);
		out.flush();
		out.close();
		System.out.println("done");
	}
}
