package app11;

class P{
	int i;
}

class Q implements Cloneable {
	int j;
	String s1;
	P p1;
	
	Q getDuplicate() throws CloneNotSupportedException{
		Q obj = (Q) clone();
		return obj;
	}
}


public class M6 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Q q1 = new Q();
		q1.j = 20;
		q1.s1 = "abc";
		q1.p1 = new P();
		q1.p1.i = 200;
		
		Q q2 = q1.getDuplicate();
		System.out.println(q1.j);
		System.out.println(q1.s1);
		System.out.println(q1.p1.i);
		System.out.println(q2.j);
		System.out.println(q2.s1);
		System.out.println(q2.p1.i);
		System.out.println("---------------");
		q1.j = 120;
		q1.s1 = "xyz";
		q1.p1.i = 1200;
		
		System.out.println(q1.j);
		System.out.println(q1.s1);
		System.out.println(q1.p1.i);
		System.out.println(q2.j);
		System.out.println(q2.s1);
		System.out.println(q2.p1.i);
		System.out.println("---------------");
		q1.j = 520;
		q1.s1 = "hello";
		q1.p1.i = 15000;
		
		System.out.println(q1.j);
		System.out.println(q1.s1);
		System.out.println(q1.p1.i);
		System.out.println(q2.j);
		System.out.println(q2.s1);
		System.out.println(q2.p1.i);
		
		
		
		
		
		
	}
}
