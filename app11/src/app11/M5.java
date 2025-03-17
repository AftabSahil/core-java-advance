package app11;
class E implements Cloneable {
	int i;
	String s1;
	
	E getDuplicate() throws CloneNotSupportedException{
		E obj = (E) this.clone();
		return obj;
	}
}
public class M5 {
	public static void main(String[] args) throws CloneNotSupportedException{
		E e1 = new E();
		e1.i = 100;
		e1.s1 ="abc";
		E e2 = e1.getDuplicate();
		System.out.println(e1.i);
		System.out.println(e1.s1);
		System.out.println(e2.i);
		System.out.println(e2.s1);
		System.out.println(e1.i);
		System.out.println(e1.s1);
		System.out.println(e2.i);
		System.out.println(e2.s1);
	}
}
