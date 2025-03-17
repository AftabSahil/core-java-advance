package app35;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class L implements Externalizable {	
	int a;
	int b;
	int c;	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(a);
		out.writeInt(c);
		out.writeUTF("xyz");
		out.writeInt(30000);
	}	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		a = in.readInt();
		c = in.readInt();
		System.out.println(in.readUTF());
		System.out.println(in.readInt());
	}
}
public class M15 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("test15.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		L obj = new L();
		obj.a = 10;
		obj.b = 20;
		obj.c = 30;
		obj.writeExternal(out);
		out.flush();
		out.close();
		System.out.println("-----------------");		
		FileInputStream fin = new FileInputStream("test15.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		L obj1 = new L();
		obj1.readExternal(in);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		
	}
}








