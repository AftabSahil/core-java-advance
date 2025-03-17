package app23;

import java.util.Vector;
import java.util.function.Consumer;

public class M55 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(300);
		v1.add(3100);
		v1.add(1300);
		v1.add(3400);
		v1.add(4300);
		v1.add(3500);
		v1.forEach((t) ->{
				System.out.print(t + ", ");
			}
		);
	}
}
