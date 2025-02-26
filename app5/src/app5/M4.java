package app5;

public class M4 {
	
	public static void main(String[] args) {
		
//		private class A{
//			
//		}

//		static class B{
//			
//		}
	
		int i = 10;
		
		class C{
			void test() {
				System.out.println(i);
			}
		}
		
		C c1 = new C();
		c1.test();
//		i = 20;
		c1.test();
		c1.test();
		
	}
	
}
