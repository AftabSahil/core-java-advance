package app12;
class A{
	
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = a1;
		//object is a live
		a1 =null;
		//object is a live
		a2 = null;
		//object became abandoned
		
	}
}
