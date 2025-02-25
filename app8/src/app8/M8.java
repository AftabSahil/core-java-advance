package app8;
class H < E >{
	E attr1;
	E test() {
		return attr1;
	}
}
public class M8 {
	public static void main(String[] args) {
		H<Integer> h1 = new H<>();
		h1.attr1 = 0;
		int i = h1.test();		// int i = h1.test().intValue();
		System.out.println(i);
		
		h1.attr1 = 100;
		i = h1.test();
		System.out.println(i);
		
		
		H<String> h2 = new H<>();
		String s1 = h2.test();
		System.out.println(s1);
		
		h2.attr1 = "abc";
		s1 = h2.test();
		System.out.println(s1);
		
	}
}
