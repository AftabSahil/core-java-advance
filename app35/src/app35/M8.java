package app35;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class D  {
	int i;
	D(){
		System.out.println("D()");
	}
}

class E extends D {
	int j;
	E(){
		System.out.println("E()");
	}
}

class F extends E implements Serializable{
	int k;
	F(){
		System.out.println("F()");
	}
}


public class M8 {
	public static void main(String[] args) throws Exception{
		F f1 = new F();
		f1.i = 10;
		f1.j = 20;
		f1.k = 30;		
		FileOutputStream fout = new FileOutputStream("test8.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(f1);
		out.flush();
		out.close();
		System.out.println("-------");
		FileInputStream fin = new FileInputStream("test8.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		F obj = (F) in.readObject();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);		
	}
}










