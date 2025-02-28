package app9;
class C{
	int i;
	int j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
//		return "i = " + i + " and j = " + j;
//		return "(i = " + i + " and j = " + j + ")";
//		return "C state: [i = " + i + " and j = " + j;
		return "obj address:" +super.toString() + "and obj state:[i = " + i + " and j = " + j + "]";
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(90,190);
		C c2 = new C(910,490);
		C c3 = new C(9045,690);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}
