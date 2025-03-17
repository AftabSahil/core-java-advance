package app35;

import java.io.IOException;
import java.io.PrintStream;

public class M18 {
	public static void main(String[] args) throws IOException{
		PrintStream p1 = new PrintStream("stdout.log");
		PrintStream p2 = System.out;
		p1.println(1);	//f
		System.out.println(2);//c
		p2.println(3);//c
		System.setOut(p1);
		p1.println(4);//f
		System.out.println(5);//f
		p2.println(6);//c
		System.setOut(p2);
		p1.println(7);//f
		System.out.println(8);//c
		p2.println(9);//c
	}
}
