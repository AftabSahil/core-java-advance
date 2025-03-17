package app20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M20 {
	public static void main(String[] args) 
	{ 
	//String src "abc.xyz.test@hello"; 
	//String src = "abc@hello"; 
	//String src "abc.xyz@hello"; 
	String src = "abc.xyz.test.java.blr@hello"; 
	String exp  = "^[a-z] ([a-z]+\\.)*a-z]+[a-z]+$"; 
	Pattern p1 = Pattern.compile(exp); 
	Matcher mi = p1.matcher (src); 
	System.out.println(mi.find()); 
	}
}