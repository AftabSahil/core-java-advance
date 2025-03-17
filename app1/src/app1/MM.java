package app1;

import java.util.HashSet;
public class MM {
	public static void main(String[] args) {
		HashSet<Boolean> set = 
				new HashSet<Boolean>();
		System.out.print(set.add(true));
		System.out.print(set.add(false));
		System.out.print(set.add(false));
		System.out.print(set.contains(true));
	}
}
