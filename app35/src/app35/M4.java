package app35;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C implements Serializable{
	int i;
	Double j;
	String s1;	//	has-a
	public C(int i, Double j, String s1) {
		super();
		this.i = i;
		this.j = j;
		this.s1 = s1;
	}
}
public class M4 {
	public static void main(String[] args) throws Exception{
		C c1 = new C(10, 35.56, "abc");
		FileOutputStream fout = new FileOutputStream("test4.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(c1);
		out.flush();
		out.close();
		System.out.println("done");
	}
}







