package app9;
class K {
	int a;
	int b;
	int c;
	
	K(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public int hashCode() {
		int hash = Integer.toString(a).hashCode();
		hash += Integer.toString(b).hashCode();
		hash += Integer.toString(c).hashCode();
		return hash;
	}
}
public class M12 {
	public static void main(String[] args) {
		K k1 = new K(10, 20, 30);
		K k2 = new K(10, 20, 30);
		K k3 = new K(20, 10, 30);
		K k4 = new K(20, 10, 30);
		K k5 = new K(20, 30, 10);
		K k6 = new K(20, 30, 10);
		
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
		System.out.println(k3.hashCode());
		System.out.println(k4.hashCode());
		System.out.println(k5.hashCode());
		System.out.println(k6.hashCode());
		
		
	}
}
