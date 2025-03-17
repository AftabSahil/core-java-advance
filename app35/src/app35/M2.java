package app35;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B implements Serializable{
	int i;
	B(int i){
		this.i = i;
	}
}

public class M2 {
	public static void main(String[] args) throws Exception{
		B b1 = new B(10);
		FileOutputStream fout = new FileOutputStream("test2.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(b1);
		out.flush();
		out.close();
		System.out.println("done");
	}
}