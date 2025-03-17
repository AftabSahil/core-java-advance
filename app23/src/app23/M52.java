package app23;

import java.util.Enumeration;
import java.util.Vector;

public class M52 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(300);
		v1.add(3100);
		v1.add(1300);
		v1.add(3400);
		v1.add(4300);
		v1.add(3500);
		Enumeration<Integer> em = v1.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		System.out.println("-------------");
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}

}
