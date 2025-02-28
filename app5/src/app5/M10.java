package app5;
abstract class F{
	abstract void test1();
}
interface G{
	void methord1();
}
public class M10 {
		static void f1(F arg) {
			arg.test1();
		}
		static void f2(G arg) {
			arg.methord1();
		}
	
	public static void main(String[] args) {
		f1(new F() {
			@Override
			void test1() {
				System.out.println("F-test1");
				
			}
		});
		f2(new G() {
			@Override
			public void methord1() {
				System.out.println("G-methord1");
				
			}
		});
	}

	
	

}
