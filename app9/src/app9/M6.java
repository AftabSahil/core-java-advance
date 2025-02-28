package app9;
class F{
	int i;
	F(int i){
		this.i = i;
	}
	@Override
	public boolean equals(Object obj) {
		return this.i == ((F)obj).i;
	}
}
public class M6 {
	public static void main(String[] args) {
		F f1 = new F(90);
		F f2 = new F(90);
		F f3 = new F(190);
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));
		System.out.println(f2.equals(f3));
	}
}
