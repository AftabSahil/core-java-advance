package app5;
interface K{
	void test(int i, int j);
}
public class M14 {
	public static void main(String[] args) {
		K obj = (a, b) ->{
			System.out.println("stmt1:" + a + "," + b);
			System.out.println("stmt1:" + a + "," + b);
			System.out.println("stmt1:" + a + "," + b);
			System.out.println("stmt1:" + a + "," + b);
		};
	}

}
