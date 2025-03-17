package app27;
import java.util.HashMap;
import java.util.HashSet;

class D{
	int i;
	D(int i){
		this.i = i;
	}
	public String toString() {
		return "(i = "+ i + ")";
	}
	@Override
	public int hashCode() {
		return Integer.toString(i).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof D) && (i == ((D)obj).i);
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(90);
		D d2 = new D(90);
		D d3 = new D(190);
		D d4 = new D(190);
		HashSet<D> set = new HashSet<D>();
		set.add(d1);
		set.add(d2);
		set.add(d3);
		set.add(d4);
		System.out.println(set);
		System.out.println("------------");
		
		HashMap<D, String> map1 = new HashMap<D, String>();
		map1.put(d1, "abc");
		map1.put(d2, "xyz");
		map1.put(d3, "hello");
		map1.put(d4, "test");
		System.out.println(map1);
		
		
		
		
		
		
		
		
		
		
	}
}
