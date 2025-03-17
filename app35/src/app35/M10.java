package app35;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class I implements Serializable{
	int a;
	void test() {
		
	}
	
	int h;
	
	void abc() {
		
	}
}
public class M10 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("test10.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		I obj = new I();
		obj.a = 22;
		out.writeObject(obj);
		out.flush();
		out.close();
		System.out.println("done");
		
	}
}
