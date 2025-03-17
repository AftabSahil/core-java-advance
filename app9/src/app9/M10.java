package app9;
class I
{
	int a;
	I(int a){
		this.a = a;
	}
	
	@Override
	public int hashCode() {
		return Integer.toString(a).hashCode();
	}
}
public class M10 {
	public static void main(String[] args) {
		I obj1 = new I(90);
		I obj2 = new I(90);
		I obj3 = new I(901);
		I obj4 = new I(901);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}
}
