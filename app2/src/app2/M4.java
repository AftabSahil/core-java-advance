package app2;

public class M4 {
	public static void main(String[] args) {
		boolean flag = false;
		
		boolean b1 = Boolean.valueOf(flag);	//	boxing
		boolean b2 = b1.booleanValue();		//unboxing
		
		System.out.println("done");
	}
}
