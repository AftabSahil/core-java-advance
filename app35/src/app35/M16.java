package app35;

import java.io.IOException;
import java.io.PrintStream;

public class M16 {
	public static void main(String[] args) throws IOException{
		PrintStream p1 = new PrintStream("test16.txt");
		p1.println("hello");
		p1.println("hello");
		p1.println("hello");
		p1.println("hello");
		p1.println("hello");
		System.out.println("done");
	}
}
