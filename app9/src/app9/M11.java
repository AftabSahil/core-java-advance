package app9;

class J{
	int a;
	double b;
	J(int a, double b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int hashCode() {
		String s1 = Integer.toString(a);
		String s2 = Double.toString(b);
		int hash = s1.hashCode() + s2.hashCode();
		return hash;
	}
}
public class M11 {
	public static void main(String[] args) {
		J j1 = new J(10, 3.5);
		J j2 = new J(10, 3.5);
		J j3 = new J(20, 13.5);
		J j4 = new J(20, 13.5);
		J j5 = new J(20, 13.6);
		
		System.out.println(j1.hashCode());
		System.out.println(j2.hashCode());
		System.out.println(j3.hashCode());
		System.out.println(j4.hashCode());
		System.out.println(j5.hashCode());
	}
}
