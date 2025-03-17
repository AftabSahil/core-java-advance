package app3;

public class M14 {
	static void test(int[] ... arg)
	{
		System.out.print(arg.length.length);
	}
	
	public static void main(String[] args) {
		int[] a = new int[2];
		int[] b = new int[3];
		int[] c = new int[4];
		M14.test(a, b, c);
	}
}
	/*
	void test1(int ... is)
	{
		
	}
	void test1(int[] param)
	{
		
	}
	*/
}




