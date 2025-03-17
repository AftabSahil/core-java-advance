package app11;
class D implements Cloneable{
	void test() throws CloneNotSupportedException{
		D obj = (D) clone();
		System.out.println("done");
	}
}


public class M4 {
	public static void main(String[] args) throws CloneNotSupportedException{
		D d1 = new D();
		d1.test();
	}
}
