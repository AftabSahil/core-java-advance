package app9;
class D{
	int i;
	D(int i){
		this.i = i;
	}
}
public class M5 {
	public static void main(String[] args) {
		D d1 = new D(100);
		D d2 = new D(100);
		D d3 = new D(200);
		D d4 = d1;
		
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);
		System.out.println(d2 == d3);
		System.out.println(d4 == d1);
		System.out.println("------------------");
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d2.equals(d3));
		System.out.println(d4.equals(d1));
		System.out.println("------------------");
		System.out.println(d1.i == d2.i);
		System.out.println(d1.i == d3.i);
		System.out.println(d2.i == d3.i);
	}
}
