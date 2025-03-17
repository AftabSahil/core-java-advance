package app35;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class G implements Serializable{
	int i;
}
class H implements Serializable{
	int j;
	G g1;
}
public class M9 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("test9.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		G g1 = new G();
		g1.i = 10;
		H h1 = new H();
		h1.g1 = g1;
		h1.j = 45;
		out.writeObject(h1);
		out.flush();
		out.close();
		System.out.println("done");
	}
}
