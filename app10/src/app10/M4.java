package app10;

import java.lang.reflect.Method;

class E{
	void test() {
		System.out.println("from  test");
	}
}
public class M4 {
	public static void main(String[] args) throws Exception{
		Class c1 = Class.forName("app10.E");
		
		Object obj = c1.newInstance();	//	new E();
		if(obj instanceof E) {
			((E)obj).test();
		}
		System.out.println("---------");
		Method m1 = c1.getDeclaredMethod("test");
		m1.invoke(obj);
		
	}
}
