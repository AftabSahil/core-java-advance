package app30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//non synchronized
		list = Collections.synchronizedList(list);
		//synchronized
		System.out.println("done");
	}
}
