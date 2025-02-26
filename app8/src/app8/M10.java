package app8;
class J < E, X >{
	E f1;
	X f2;
	J(E f1, X f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	void setAllValues(E f1, X f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	void setF1(E f1) {
		this.f1 = f1;
	}
	void setF2(X f2) {
		this.f2 = f2;
	}
	E readF1() {
		return f1;
	}
	X readF2() {
		return f2;
	}
}
public class M10 {
	public static void main(String[] args) {
		J<Integer, String> j1 = new J<>(100, "abc");
		int i = j1.readF1();
		String s1 = j1.readF2();
		System.out.println(i);
		System.out.println(s1);
		j1.setAllValues(200, "xyz");
		i = j1.readF1();
		s1 = j1.readF2();
		System.out.println(i);
		System.out.println(s1);
		j1.setF1(300);
		i = j1.readF1();
		s1 = j1.readF2();
		System.out.println(i);
		System.out.println(s1);
		j1.setF2("hello");
		i = j1.readF1();
		s1 = j1.readF2();
		System.out.println(i);
		System.out.println(s1);
	}
}





