package pack1;
class C{
	int i;
	C obj;
	C(int i){
		this.i = i;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(20);
		C c2 = new C(40);
		C c3 = new C(60);
		C c4 = new C(80);
		c1.obj = c2;
		c2.obj = c3;
		c3.obj = c4;
		System.out.println(c1.i);
		System.out.println(c1.obj.i);
		System.out.println(c1.obj.obj.i);
		System.out.println(c1.obj.obj.obj.i);
	}
}
