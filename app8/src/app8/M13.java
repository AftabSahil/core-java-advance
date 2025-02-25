package app8;

class U < E >{
	E f1;
}

public class M13 {
	public static void main(String[] args) {
		U <?> u1 = new U<Integer>();
		u1 = new U<String>();
		u1 = new U<Double>();
		u1 = new U<StringBuffer>();
		u1 = new U<Object>();
		u1 = 12.4;
		u1 = new object();
		
		U<Interger> u2 = newU<String>();
		
		System.out.println("done");
	}
}
