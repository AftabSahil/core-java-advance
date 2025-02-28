package app8;
class E < Type > {
	Type i;
	
}

public class M5 {
	public static void main(String[] args) {
		E<String> e1 = new E<String>();
		e1.i = "abc";
		
		
		E<String> e2 = new E<String>();
		e2.i = "abc";
		
		E<Double> e3 = new E<Double>();
		e3.i = 3.4;
		
		
		E<StringBuffer> e4 = new E<StringBuffer>();
		e4.i = new StringBuffer();
		
		
		E<StringBuilder> e5 = new E<StringBuilder>();
		e5.i = new StringBuilder();
		
		System.out.println("done");
	}
}
