package app8;

class U < E >{
	E f1;
}

public class M13 {
	public static void main(String[] args) {
		
		
		
		U <?> u1 = new U<Integer>();
		u1 = new U<StringBuffer>();
		u1 = new U<String>();
		u1 = new U<Object>();
		u1 = new U<Double>();
//		u1.f1 = 300;
//		u1.f1 = new Object();
		
		U<Integer> u2 = new U<Integer>();
		u2.f1 = 100;
		
		System.out.println("done");
	}
}
