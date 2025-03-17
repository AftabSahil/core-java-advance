package app35;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class K implements Serializable{
	int a;
	int b;
	int c;
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		System.out.println("from writeObject");
		out.writeInt(5000);
		out.defaultWriteObject();
		out.writeUTF("xyz");
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		System.out.println("from readObject");
		System.out.println(in.readInt());
		in.defaultReadObject();
		System.out.println(in.readUTF());
	}
	
	
}
public class M14 {
	public static void main(String[] args) throws Exception{
		K k1 = new K();
		k1.a = 10;
		k1.b = 20;
		k1.c = 30;
		
		FileOutputStream fout = new FileOutputStream("test14.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(k1);
		System.out.println("-----------");
		FileInputStream fin = new FileInputStream("test14.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		K obj = (K) in.readObject();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}








