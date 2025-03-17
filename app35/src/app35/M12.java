package app35;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class J implements Serializable{
	int a;
	transient int b;
	static int c;
}
public class M12 {
	public static void main(String[] args) throws Exception{
		J j1 = new J();
		j1.a = 100;
		j1.b = 200;
		j1.c = 300;
		FileOutputStream fout = new FileOutputStream("test12.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(j1);
		out.flush();
		out.close();
		System.out.println("done");
	}
}
