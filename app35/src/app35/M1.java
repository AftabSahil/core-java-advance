package app35;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class A{
	int i;
	A(int i){
		this.i = i;
	}
}

public class M1 {
	public static void main(String[] args) throws Exception{
		A a1 = new A(10);
		FileOutputStream fout = new FileOutputStream("test1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		System.out.println("done");
	}
}





