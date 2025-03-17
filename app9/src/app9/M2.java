package app9;
class B{
	int i;
	B(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}	
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(90);
		System.out.println(b1);
		B b2 = new B(190);
		System.out.println(b2);
		String s1 = "my 2nd object:" + b2;
		System.out.println(s1);
	}
}
